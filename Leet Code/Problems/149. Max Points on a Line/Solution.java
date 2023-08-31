class Solution
{
    public int maxPoints(int[][] points)
    {
        int max=1;
        for(int fix[] : points)
        {
            Map<Double,Integer> map = new HashMap<>();
            for(int pnt[] : points)
            {
                if(!Arrays.equals(fix,pnt))
                {
                    double key = Math.atan2(fix[1]-pnt[1],fix[0]-pnt[0]);
                    int val = map.getOrDefault(key,1)+1;
                    map.put(key,val);
                    max=Integer.max(max,val);
                }
            }
        }
        return max;
    }
}
