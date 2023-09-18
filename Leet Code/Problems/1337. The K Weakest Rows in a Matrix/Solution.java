class Solution
{
    public int[] kWeakestRows(int[][] mat, int k)
    {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt((int a[])->a[0]).thenComparingInt((int a[])->a[1]));
        for(int i=0;i<mat.length;i++)
        {
            int tuple[] = new int[]{0,i};
            for(int j=0;j<mat[0].length && mat[i][j]==1;tuple[0]++,j++);
            pq.add(tuple);
        }
        int ans[] = new int[k];
        for(int i=0;i<k;ans[i++]=pq.poll()[1]);
        return ans;
    }
}
