class Solution
{
    public long minimumSteps(String s)
    {
        long cnt=0L;
        for(int i=0,b=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                cnt+=b;
            }
            else
            {
                b++;
            }
        }
        return cnt;
    }
}
