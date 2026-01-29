class Solution
{
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost)
    {
        int map[][] = new int[26][26];
        for(int m[] : map)
        {
            Arrays.fill(m,Integer.MAX_VALUE);
        }
        IntStream.range(0,26).forEach(i->map[i][i]=0);
        for(int i=0;i<cost.length;i++)
        {
            map[original[i]-'a'][changed[i]-'a']=Integer.min(map[original[i]-'a'][changed[i]-'a'],cost[i]);
        }
        for(int k=0;k<26;k++)
        {
            for(int i=0;i<26;i++)
            {
                for(int j=0;j<26;j++)
                {
                    if(map[i][k]!=Integer.MAX_VALUE && map[k][j]!=Integer.MAX_VALUE)
                    {
                        map[i][j]=Integer.min(map[i][j],map[i][k]+map[k][j]);
                    }
                }
            }
        }
        long cnt=0L;
        for(int i=0;i<source.length();i++)
        {
            if(map[source.charAt(i)-'a'][target.charAt(i)-'a']==Integer.MAX_VALUE)
            {
                return -1L;
            }
            cnt+=map[source.charAt(i)-'a'][target.charAt(i)-'a'];
        }
        return cnt;
    }
}
