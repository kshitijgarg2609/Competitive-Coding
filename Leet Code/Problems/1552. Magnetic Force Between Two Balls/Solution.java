class Solution
{
    public int maxDistance(int[] position, int m)
    {
        int max_d=0;
        Arrays.sort(position);
        for(int l=1,r=position[position.length-1]-position[0];l<=r;)
        {
            int mid=(int)((0L+l+r)/2);
            int pos=position[0];
            int ball_cnt=1;
            for(int i=1;i<position.length && ball_cnt<m;i++)
            {
                if((position[i]-pos)>=mid)
                {
                    ball_cnt++;
                    pos=position[i];
                }
            }
            if(ball_cnt==m)
            {
                max_d=mid;
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return max_d;
    }
}
