class Solution
{
    public int[] kWeakestRows(int[][] mat, int k)
    {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>()
        {
            public int compare(int a[],int b[])
            {
                int rank_match=Integer.compare(a[0],b[0]);
                return (rank_match!=0)?rank_match:(Integer.compare(a[1],b[1]));
            }
        });
        int r=mat.length;
        int c=mat[0].length;
        for(int i=0;i<r;i++)
        {
            int tuple[] = new int[]{0,i};
            for(int j=0;j<c;j++)
            {
                if(mat[i][j]==0)
                {
                    break;
                }
                tuple[0]++;
            }
            pq.add(tuple);
        }
        int ans[] = new int[k];
        for(int i=0;i<k;i++)
        {
            int tuple[] = pq.poll();
            ans[i]=tuple[1];
        }
        return ans;
    }
}
