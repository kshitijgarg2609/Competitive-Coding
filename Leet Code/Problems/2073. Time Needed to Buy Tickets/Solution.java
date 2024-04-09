class Solution
{
    public int timeRequiredToBuy(int[] tickets, int k)
    {
        int t=0;
        while(tickets[k]>0)
        {
            for(int i=0;i<tickets.length && tickets[k]>0;i++)
            {
                if(tickets[i]>0)
                {
                    tickets[i]--;
                    t++;
                }
            }
        }
        return t;
    }
}
