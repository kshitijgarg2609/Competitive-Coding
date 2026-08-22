class Solution
{
    public boolean checkDivisibility(int n)
    {
        int s=0,p=1;
        for(int m=n;m>0;s+=m%10,p*=m%10,m/=10);
        return n%(s+p)==0;
    }
}
