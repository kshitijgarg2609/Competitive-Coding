class Solution
{
    public int matchPlayersAndTrainers(int[] players, int[] trainers)
    {
        int cnt=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        for(int t=0;t<trainers.length && cnt<players.length;t++)
        {
            if(players[cnt]<=trainers[t])
            {
                cnt++;
            }
        }
        return cnt;
    }
}
