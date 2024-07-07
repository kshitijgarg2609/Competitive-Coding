class Solution
{
    public int numWaterBottles(int numBottles, int numExchange)
    {
        int cnt=numBottles;
        for(int filled=0,unfilled=numBottles;unfilled>=numExchange;)
        {
            filled=unfilled/numExchange;
            cnt+=filled;
            unfilled=filled+unfilled%numExchange;
        }
        return cnt;
    }
}
