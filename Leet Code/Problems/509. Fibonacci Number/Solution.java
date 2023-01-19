class Solution
{
    public boolean checkPerfectNumber(int num)
    {
        if(num<=1)
        {
            return false;
        }
        int sum=0;
        for(int i=1;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                sum+=(i)+(num/i);
            }
        }
        sum-=num;
        return sum==num;
    }
}
