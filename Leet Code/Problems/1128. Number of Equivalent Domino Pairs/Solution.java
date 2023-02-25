class Solution
{
    public int numEquivDominoPairs(int[][] dominoes)
    {
        int cnt=0;
        Map<List<Integer>,Integer> map = new HashMap<>();
        for(int d[] : dominoes)
        {
            List<Integer> dom = Arrays.asList(Integer.min(d[0],d[1]),Integer.max(d[0],d[1]));
            map.put(dom,map.getOrDefault(dom,0)+1);
        }
        for(int x : map.values())
        {
            if(x>=2)
            {
                cnt+=(x*(x-1))/2;
            }
        }
        return cnt;
    }
}
