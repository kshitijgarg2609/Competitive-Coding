class Solution
{
    public int[] productQueries(int n, int[][] queries)
    {
        Long mod = (long)(1e9+7);
        List<Integer> list = new LinkedList<>();
        for(int cnt=1;n>0;cnt*=2,n/=2)
        {
            if(n%2==1)
            {
                list.add(cnt);
            }
        }
        return Arrays.stream(queries).mapToInt(q->
        {
            long cnt=1L;
            for(int i=q[0];i<=q[1];cnt=(cnt*list.get(i++))%mod);
            return (int)(cnt);
        }).toArray();
    }
}
