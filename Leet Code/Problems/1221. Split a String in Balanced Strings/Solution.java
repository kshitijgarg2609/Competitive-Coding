class Solution
{
    public int balancedStringSplit(String s)
    {
        int bal=0;
        int cnt=0;
        for(char c : s.toCharArray())
        {
            bal=(c=='R')?(bal+1):(bal-1);
            cnt=(bal==0)?(cnt+1):cnt;
        }
        return cnt;
    }
}
