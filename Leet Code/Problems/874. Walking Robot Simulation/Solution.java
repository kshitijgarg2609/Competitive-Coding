class Solution
{
    public int robotSim(int[] commands, int[][] obstacles)
    {
        Map<Integer,Set<Integer>> map = new HashMap<>();
        for(int obs[] : obstacles)
        {
            map.computeIfAbsent(obs[0],key->new HashSet<>()).add(obs[1]);
        }
        int dir[][] = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        int xy[] = new int[2];
        int d=0,euc=0;
        for(int command : commands)
        {
            if(command==-2)
            {
                d=(d+4-1)%4;
            }
            else if(command==-1)
            {
                d=(d+1)%4;
            }
            else
            {
                for(int k=1;k<=command;k++)
                {
                    int mv[] = new int[]{xy[0]+dir[d][0],xy[1]+dir[d][1]};
                    if(map.containsKey(mv[0]) && map.get(mv[0]).contains(mv[1]))
                    {
                        break;
                    }
                    xy=mv;
                    euc=Integer.max(euc,((xy[0]*xy[0])+(xy[1]*xy[1])));
                }
            }
        }
        return euc;
    }
}
