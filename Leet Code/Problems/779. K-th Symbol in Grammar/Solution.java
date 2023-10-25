class Solution
{
    public int kthGrammar(int n, int k)
    {
        int flips=0;
        for(int cnt=(int)(Math.pow(2,n-1));cnt>1;cnt=cnt/2)
        {
            if(k>(cnt/2))
            {
                k-=(cnt/2);
                flips++;
            }
        }
        return flips%2;
    }
}
