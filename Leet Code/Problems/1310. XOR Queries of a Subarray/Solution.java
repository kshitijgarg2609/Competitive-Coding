class Solution
{
    public int[] xorQueries(int[] arr, int[][] queries)
    {
        int prfx[] = new int[arr.length+1];
        for(int i=0;i<arr.length;i++)
        {
            prfx[i+1]=prfx[i]^arr[i];
        }
        return IntStream.range(0,queries.length).map(i->prfx[queries[i][0]]^prfx[queries[i][1]+1]).toArray();
    }
}
