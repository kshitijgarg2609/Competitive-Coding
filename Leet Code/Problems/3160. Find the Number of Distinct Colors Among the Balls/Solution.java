class Solution
{
    public int[] queryResults(int limit, int[][] queries)
    {
        Map<Integer,Integer> ballMap = new HashMap<>();
        Map<Integer,Integer> colorMap = new HashMap<>();
        int res[] = new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            if(ballMap.containsKey(queries[i][0]))
            {
                int color=ballMap.remove(queries[i][0]);
                int cnt=colorMap.remove(color)-1;
                if(cnt>0)
                {
                    colorMap.put(color,cnt);
                }
            }
            ballMap.put(queries[i][0],queries[i][1]);
            colorMap.put(queries[i][1],colorMap.getOrDefault(queries[i][1],0)+1);
            res[i]=colorMap.size();
        }
        return res;
    }
}
