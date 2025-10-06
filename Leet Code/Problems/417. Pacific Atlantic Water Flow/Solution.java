class Solution
{
    public List<List<Integer>> pacificAtlantic(int[][] heights)
    {
        int m=heights.length,n=heights[0].length;
        int dir[][] = new int[][]{{0,-1},{0,1},{-1,0},{1,0}};
        boolean vis[][][] = new boolean[2][heights.length][heights[0].length];
        for(int oc=0;oc<2;oc++)
        {
            Queue<int[]> bfs = new LinkedList<>();
            for(int c=0;c<n;c++)
            {
                int ij[] = (oc==0)?(new int[]{0,c}):(new int[]{m-1,c});
                bfs.add(ij);
                vis[oc][ij[0]][ij[1]]=true;
            }
            for(int r=0;r<m;r++)
            {
                int ij[] = (oc==0)?(new int[]{r,0}):(new int[]{r,n-1});
                bfs.add(ij);
                vis[oc][ij[0]][ij[1]]=true;
            }
            while(!bfs.isEmpty())
            {
                int i=bfs.peek()[0],j=bfs.remove()[1];
                for(int d[] : dir)
                {
                    int in=i+d[0],jn=j+d[1];
                    if(in<0 || jn<0 || in>=m || jn>=n || vis[oc][in][jn] || heights[i][j]>heights[in][jn])
                    {
                        continue;
                    }
                    vis[oc][in][jn]=true;
                    bfs.add(new int[]{in,jn});
                }
            }
        }
        List<List<Integer>> list = new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(vis[0][i][j] && vis[1][i][j])
                {
                    list.add(Arrays.asList(i,j));
                }
            }
        }
        return list;
    }
}
