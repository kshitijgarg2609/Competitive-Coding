class Solution
{
    public int findChampion(int n, int[][] edges)
    {
        int arr[] = new int[n];
        for(int edge[] : edges)
        {
            arr[edge[1]]++;
        }
        int ans[] = IntStream.range(0,n).filter(i->arr[i]==0).toArray();
        return ans.length==1?ans[0]:-1;
    }
}
