class Solution
{
    public boolean canPartitionGrid(int[][] grid)
    {
        int m=grid.length,n=grid[0].length;
        long rsum[] = new long[n];
        long csum[] = new long[m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                rsum[j]+=grid[i][j];
                csum[i]+=grid[i][j];
            }
        }
        for(long arr[] : Arrays.asList(rsum,csum))
        {
            long l=0,r=Arrays.stream(arr).sum();
            for(int i=0;i<arr.length-1;i++)
            {
                l+=arr[i];
                r-=arr[i];
                if(l==r)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
