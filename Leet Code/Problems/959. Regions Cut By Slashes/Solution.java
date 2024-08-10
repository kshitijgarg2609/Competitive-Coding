class Solution
{
    public int regionsBySlashes(String[] grid)
    {
        int cnt=0;
        int arr[][] = new int[3*grid.length][3*grid.length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                if(grid[i].charAt(j)=='/')
                {
                    arr[(i*3)][(j*3)+2]=arr[(i*3)+1][(j*3)+1]=arr[(i*3)+2][(j*3)]=1;
                }
                else if(grid[i].charAt(j)=='\\')
                {
                    arr[(i*3)][(j*3)]=arr[(i*3)+1][(j*3)+1]=arr[(i*3)+2][(j*3)+2]=1;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i][j]==1)
                {
                    continue;
                }
                Queue<int[]> qu = new LinkedList<>();
                qu.add(new int[]{i,j});
                arr[i][j]=1;
                while(!qu.isEmpty())
                {
                    int pnt[] = qu.remove();
                    for(int d[] : new int[][]{{0,1},{1,0},{0,-1},{-1,0}})
                    {
                        int nxt[] = new int[]{pnt[0]+d[0],pnt[1]+d[1]};
                        if(nxt[0]>=0 && nxt[0]<arr.length && nxt[1]>=0 && nxt[1]<arr.length && arr[nxt[0]][nxt[1]]==0)
                        {
                            arr[nxt[0]][nxt[1]]=1;
                            qu.add(nxt);
                        }
                    }
                }
                cnt++;
            }
        }
        return cnt;
    }
}
