class Solution
{
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter)
    {
        int dir[][] = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        List<int[]> li = new ArrayList<>(Arrays.asList(new int[]{rCenter,cCenter}));
        boolean visit[][] = new boolean[rows][cols];
        visit[rCenter][cCenter]=true;
        for(int i=0;i<li.size();i++)
        {
            int pnt[] = li.get(i);
            for(int d[] : dir)
            {
                int pnt_new[] = new int[]{pnt[0]+d[0],pnt[1]+d[1]};
                if(pnt_new[0]>=0 && pnt_new[0]<rows && pnt_new[1]>=0 && pnt_new[1]<cols && !visit[pnt_new[0]][pnt_new[1]])
                {
                    li.add(pnt_new);
                    visit[pnt_new[0]][pnt_new[1]]=true;
                }
            }
        }
        return li.toArray(new int[li.size()][]);
    }
}
