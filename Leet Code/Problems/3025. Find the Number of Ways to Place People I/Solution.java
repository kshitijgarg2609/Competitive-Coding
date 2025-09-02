class Solution
{
    public int numberOfPairs(int[][] points)
    {
        int cnt=0;
        for(int ul[] : points)
        {
            for(int lr[] : points)
            {
                if(!Arrays.equals(ul,lr) && ul[0]<=lr[0] && ul[1]>=lr[1])
                {
                    if(Arrays.stream(points).filter(p->!Arrays.equals(p,ul) && !Arrays.equals(p,lr)).filter(p->ul[0]<=p[0] && p[0]<=lr[0] && ul[1]>=p[1] && p[1]>=lr[1]).count()==0L)
                    {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
