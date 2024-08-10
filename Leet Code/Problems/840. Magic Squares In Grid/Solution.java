class Solution
{
    public int numMagicSquaresInside(int[][] grid)
    {
        int cnt=0;
        for(int i=1;i<grid.length-1;i++)
        {
            for(int j=1;j<grid[0].length-1;j++)
            {
                Set<Integer> numbers = new HashSet<>(){{for(int i=1;i<=9;add(i++));}};
                for(int p=-1;p<=1;p++)
                {
                    for(int q=-1;q<=1;q++)
                    {
                        numbers.remove(grid[i+p][j+q]);
                    }
                }
                Set<Integer> set = new HashSet<>();
                set.add(grid[i-1][j-1]+grid[i-1][j]+grid[i-1][j+1]);
                set.add(grid[i][j-1]+grid[i][j]+grid[i][j+1]);
                set.add(grid[i+1][j-1]+grid[i+1][j]+grid[i+1][j+1]);
                set.add(grid[i-1][j-1]+grid[i][j-1]+grid[i+1][j-1]);
                set.add(grid[i-1][j]+grid[i][j]+grid[i+1][j]);
                set.add(grid[i-1][j+1]+grid[i][j+1]+grid[i+1][j+1]);
                set.add(grid[i-1][j-1]+grid[i][j]+grid[i+1][j+1]);
                set.add(grid[i+1][j-1]+grid[i][j]+grid[i-1][j+1]);
                if(set.size()==1 && numbers.size()==0)
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
