class Solution
{
    public int[][] rotateGrid(int[][] grid, int k)
    {
        int m=grid.length,n=grid[0].length;
        int arr[][] = new int[m][n];
        for(int r[] = new int[]{0,m-1},c[] = new int[]{0,n-1};r[0]<r[1] && c[0]<c[1];r[0]++,r[1]--,c[0]++,c[1]--)
        {
            List<int[]> list = new ArrayList<>();
            List<Integer> val = new ArrayList<>();
            for(int i=r[0];i<=r[1];list.add(new int[]{i,c[0]}),val.add(grid[i][c[0]]),i++);
            for(int j=c[0]+1;j<c[1];list.add(new int[]{r[1],j}),val.add(grid[r[1]][j]),j++);
            for(int i=r[1];i>=r[0];list.add(new int[]{i,c[1]}),val.add(grid[i][c[1]]),i--);
            for(int j=c[1]-1;j>c[0];list.add(new int[]{r[0],j}),val.add(grid[r[0]][j]),j--);
            Collections.rotate(val,k);
            IntStream.range(0,list.size()).forEach(i->arr[list.get(i)[0]][list.get(i)[1]]=val.get(i));
        }
        return arr;
    }
}
