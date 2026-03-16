class Solution
{
    public int[] getBiggestThree(int[][] grid)
    {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        int m=grid.length,n=grid[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int u=i,d=i,l=j,r=j;u>=0 && d<m && l>=0 && r<n;u--,d++,l--,r++)
                {
                    int sum=grid[u][j]+(u==d?0:grid[d][j]);
                    for(int a=j-1,b=j+1,row=u+1,dir=1;row<d;a-=dir,b+=dir,row++)
                    {
                        dir=(row<i)?1:-1;
                        sum+=grid[row][a]+grid[row][b];
                    }
                    set.add(sum);
                    if(set.size()>3)
                    {
                        set.pollLast();
                    }
                }
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
