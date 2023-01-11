class Solution
{
    public int maxProfit(int[] prices)
    {
        int min_value=prices[0];
        int max_profit=0;
        for(int i=1;i<prices.length;i++)
        {
            min_value=Integer.min(min_value,prices[i]);
            max_profit=Integer.max(max_profit,prices[i]-min_value);
        }
        return max_profit;
    }
}
