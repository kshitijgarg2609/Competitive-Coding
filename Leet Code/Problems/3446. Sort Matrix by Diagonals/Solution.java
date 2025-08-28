class Solution
{
    public int[][] sortMatrix(int[][] grid)
    {
        int n=grid.length;
        int arr[][] = new int[n][n];
        for(int start[] : Stream.concat(IntStream.range(0,n).mapToObj(r->new int[]{r,0,-1}),IntStream.range(1,n).mapToObj(c->new int[]{0,c,1})).collect(Collectors.toList()))
        {
            PriorityQueue<Integer> pq = (start[2]==-1)?(new PriorityQueue<>(Collections.reverseOrder())):(new PriorityQueue<>());
            for(int i=start[0],j=start[1];i<n && j<n;pq.add(grid[i++][j++]));
            for(int i=start[0],j=start[1];i<n && j<n;arr[i++][j++]=pq.remove());
        }
        return arr;
    }
}
