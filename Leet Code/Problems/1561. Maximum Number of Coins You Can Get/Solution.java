class Solution
{
    public int maxCoins(int[] piles)
    {
        Arrays.sort(piles);
        int cnt=0;
        for(int i=piles.length/3;i<piles.length;cnt+=piles[i],i+=2);
        return cnt;
    }
}
