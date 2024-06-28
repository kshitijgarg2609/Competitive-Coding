class Solution
{
    public long maximumImportance(int n, int[][] roads)
    {
        long cnt=0L;
        int degree[] = new int[n];
        for(int road[] : roads)
        {
            degree[road[0]]++;
            degree[road[1]]++;
        }
        Arrays.sort(degree);
        for(int i=0,val=1;i<degree.length;i++,val++)
        {
            cnt+=1L*val*degree[i];
        }
        return cnt;
    }
}
