class Solution
{
    public int minFlips(int a, int b, int c)
    {
        int cnt;
        for(cnt=0;a>0 || b>0 || c>0;a/=2,b/=2,c/=2)
        {
            if((c%2)==1)
            {
                cnt+=((a%2)==0 && (b%2)==0)?1:0;
            }
            else
            {
                cnt+=(a%2)+(b%2);
            }
        }
        return  cnt;
    }
}
