class Solution
{
    private static final Map<String,int[]> dir = Map.of("UP",new int[]{-1,0},"RIGHT",new int[]{0,1},"DOWN",new int[]{1,0},"LEFT",new int[]{0,-1});
    public int finalPositionOfSnake(int n, List<String> commands)
    {
        int ij[] = new int[2];
        commands.stream().forEach(cmd->
        {
            int d[] = dir.get(cmd);
            ij[0]+=d[0];
            ij[1]+=d[1];
        });
        return (ij[0]*n)+ij[1];
    }
}
