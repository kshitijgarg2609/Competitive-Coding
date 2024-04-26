class Solution
{
    public int[][] findFarmland(int[][] land)
    {
        List<int[]> list = new LinkedList<>();
        for(int i=0;i<land.length;i++)
        {
            for(int j=0;j<land[0].length;j++)
            {
                if(land[i][j]==0)
                {
                    continue;
                }
                int cord[] = new int[]{i,j,i,j};
                for(int p=i;p<land.length && land[p][j]==1;p++)
                {
                    for(int q=j;q<land[0].length && land[p][q]==1;q++)
                    {
                        land[p][q]=0;
                        cord[2]=p;
                        cord[3]=q;
                    }
                }
                list.add(cord);
            }
        }
        return list.stream().toArray(int[][]::new);
    }
}
