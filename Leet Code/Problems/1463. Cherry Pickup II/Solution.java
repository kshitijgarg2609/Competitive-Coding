class Solution
{
    public int cherryPickup(int[][] grid)
    {
        int m=grid.length,n=grid[0].length;
        Map<String,Integer> dp = new HashMap<>();
        int ans=0;
        dp.put(String.format("%d %d",0,n-1),grid[0][0]+grid[0][n-1]);
        for(int row=1;row<grid.length;row++)
        {
            Map<String,Integer> nxt = new HashMap<>();
            for(Map.Entry<String,Integer> ent : dp.entrySet())
            {
                int pnt[] = Arrays.stream(ent.getKey().split(" ")).mapToInt(Integer::parseInt).toArray();
                for(int r1=-1;r1<=1;r1++)
                {
                    for(int r2=-1;r2<=1;r2++)
                    {
                        int jmp[] = new int[]{pnt[0]+r1,pnt[1]+r2};
                        if(!(jmp[0]>=0 && jmp[0]<n && jmp[1]>=0 && jmp[1]<n && jmp[0]<jmp[1]))
                        {
                            continue;
                        }
                        String key=String.format("%d %d",jmp[0],jmp[1]);
                        nxt.put(key,Integer.max(ent.getValue()+grid[row][jmp[0]]+grid[row][jmp[1]],nxt.getOrDefault(key,0)));
                        ans=Integer.max(ans,nxt.get(key));
                    }
                }
            }
            dp=nxt;
        }
        return ans;
    }
}
