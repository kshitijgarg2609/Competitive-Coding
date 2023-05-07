class Solution
{
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles)
    {
        int obs[] = new int[obstacles.length];
        int h[] = new int[obstacles.length];
        int j=0;
        for(int i=0;i<obstacles.length;i++)
        {
            if(j==0 || obstacles[i]>=h[j-1])
            {
                h[j++]=obstacles[i];
                obs[i]=j;
                continue;
            }
            int left=0-1;
            int right=j;
            while((right-left)>1)
            {
                int mid=(left+right+1)/2;
                if(obstacles[i]<h[mid])
                {
                    right=mid;
                }
                else
                {
                    left=mid;
                }
            }
            h[right]=obstacles[i];
            obs[i]=right+1;
        }
        return obs;
    }
}
