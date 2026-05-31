class Solution
{
    public boolean asteroidsDestroyed(int mass, int[] asteroids)
    {
        Arrays.sort(asteroids);
        long sum=mass;
        for(int as : asteroids)
        {
            if(sum<as)
            {
                return false;
            }
            sum+=as;
        }
        return true;
    }
}
