class Solution
{
    public List<List<Integer>> shiftGrid(int[][] grid, int k)
    {
        int m=grid.length;
        int n=grid[0].length;
        List<List<Integer>> list = new LinkedList<>();
        for(int r[] : grid)
        {
            list.add(new LinkedList<>(Arrays.stream(r).boxed().collect(Collectors.toList())));
        }
        for(k=k%(m*n);k>0;k--)
        {
            for(int i=0;i<m;i++)
            {
                list.get((i+1)%m).add(0,list.get(i).remove(list.get(i).size()-1));
            }
        }
        return list;
    }
}
