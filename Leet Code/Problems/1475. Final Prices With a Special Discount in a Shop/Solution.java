class Solution
{
    public int[] finalPrices(int[] prices)
    {
        int arr[] = Arrays.copyOf(prices,prices.length);
        for(int i=0;i<prices.length;i++)
        {
            int dis=0;
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[j]<=prices[i])
                {
                    dis=prices[j];
                    break;
                }
            }
            arr[i]-=dis;
        }
        return arr;
    }
}
