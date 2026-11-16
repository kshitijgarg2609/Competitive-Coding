class Solution
{
    public boolean hasValidPath(char[][] grid)
    {
        int m=grid.length,n=grid[0].length;
        int dir[][]  = new int[][]{{0,1},{1,0}};
        if(grid[0][0]!='(' || grid[m-1][n-1]!=')')
        {
            return false;
        }
        List<List<Set<Integer>>> l = new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            List<Set<Integer>> r = new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                r.add(new HashSet<>());
            }
            l.add(r);
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                Set<Integer> result = new HashSet<>();
                if(i==0 && j==0)
                {
                    result.add(0);
                }
                if(i>0)
                {
                    result.addAll(l.get(i-1).get(j));
                }
                if(j>0)
                {
                    result.addAll(l.get(i).get(j-1));
                }
                for(int res : result)
                {
                    int k=res+(grid[i][j]=='('?1:-1);
                    if(k>=0)
                    {
                        l.get(i).get(j).add(k);
                    }
                }
            }
        }
        return l.get(m-1).get(n-1).contains(0);
    }
}
