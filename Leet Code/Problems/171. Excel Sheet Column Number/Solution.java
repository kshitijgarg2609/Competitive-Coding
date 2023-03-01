class Solution
{
    public int titleToNumber(String columnTitle)
    {
        int cnt=0;
        int mul=1;
        for(int i=columnTitle.length()-1;i>=0;i--)
        {
            cnt+=((columnTitle.charAt(i)-'A'+1)*mul);
            mul*=26;
        }
        return cnt;
    }
}
