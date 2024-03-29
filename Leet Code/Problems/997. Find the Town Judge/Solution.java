class Solution
{
    public int findJudge(int n, int[][] trust)
    {
        int degree[] = new int[n+1];
        for(int tr[] : trust)
        {
            degree[tr[0]]--;
            degree[tr[1]]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(degree[i]==n-1)
            {
                return i;
            }
        }
        return -1;
    }
}
