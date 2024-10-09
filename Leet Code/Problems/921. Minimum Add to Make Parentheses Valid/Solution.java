class Solution
{
    public int minAddToMakeValid(String s)
    {
        int cnt=0,bcnt=0;
        for(int i=0;i<s.length();i++)
        {
            if(bcnt==0 && s.charAt(i)==')')
            {
                cnt++;
                continue;
            }
            bcnt+=(s.charAt(i)=='(')?1:-1;
        }
        return cnt+bcnt;
    }
}
