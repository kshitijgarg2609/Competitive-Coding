class Solution
{
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles)
    {
        int obs[] = new int[obstacles.length];
        List<Integer> list = new ArrayList<>();
        int j=0;
        for(int i=0;i<obstacles.length;i++)
        {
            if(j==0 || obstacles[i]>=list.get(j-1))
            {
                list.add(obstacles[i]);
                j++;
                obs[i]=j;
                continue;
            }
            int indx=Collections.binarySearch(list,obstacles[i],(a,b)->(a.equals(b))?-1:Integer.compare(a,b));
            if(indx<0)
            {
                indx=-(indx+1);
            }
            list.set(indx,obstacles[i]);
            obs[i]=indx+1;
        }
        return obs;
    }
}
