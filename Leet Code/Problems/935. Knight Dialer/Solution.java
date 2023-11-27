class Solution
{
    public int knightDialer(int n)
    {
        int dir[][] = new int[][]{{-1,-2},{1,-2},{-1,2},{1,2},{-2,-1},{-2,1},{2,-1},{2,1}};
        char keypad[][] = new char[][]{{'1','2','3'},{'4','5','6'},{'7','8','9'},{'*','0','#'}};
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<keypad.length;i++)
        {
            for(int j=0;j<keypad[0].length;j++)
            {
                if(Character.isDigit(keypad[i][j]))
                {
                    List<Integer> list = new ArrayList<>();
                    map.put(keypad[i][j]-'0',list);
                    for(int d[] : dir)
                    {
                        int pnt[] = new int[]{i+d[0],j+d[1]};
                        if(pnt[0]>=0 && pnt[0]<keypad.length && pnt[1]>=0 && pnt[1]<keypad[0].length && Character.isDigit(keypad[pnt[0]][pnt[1]]))
                        {
                            list.add(keypad[pnt[0]][pnt[1]]-'0');
                        }
                    }
                }
            }
        }
        long mod = (long)(1e9+7);
        Map<Integer,Long> nums = new HashMap<>();
        for(int k : map.keySet())
        {
            nums.put(k,1L);
        }
        for(int i=1;i<n;i++)
        {
            Map<Integer,Long> ways = new HashMap<>();
            for(Map.Entry<Integer,List<Integer>> ent : map.entrySet())
            {
                long val=0;
                for(int adj : ent.getValue())
                {
                    val=(val+nums.get(adj))%mod;
                }
                ways.put(ent.getKey(),val);
            }
            nums=ways;
        }
        return (int)(nums.values().stream().mapToLong(Long::longValue).sum()%mod);
    }
}
