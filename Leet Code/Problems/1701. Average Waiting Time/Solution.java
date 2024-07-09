class Solution
{
    public double averageWaitingTime(int[][] customers)
    {
        double sum=0;
        int running=0;
        for(int customer[] : customers)
        {
            if(running<=customer[0])
            {
                sum+=customer[1];
                running=customer[0]+customer[1];
            }
            else
            {
                sum+=running+customer[1]-customer[0];
                running+=customer[1];
            }
        }
        return sum/customers.length;
    }
}
