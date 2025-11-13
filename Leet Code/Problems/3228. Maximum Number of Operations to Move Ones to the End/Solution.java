class Solution
{
    public int maxOperations(String s)
    {
        int cnt=0;
        for(int one=0,i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                for(cnt+=one;i+1<s.length() && s.charAt(i+1)=='0';i++);
            }
            else
            {
                one++;
            }
        }
        return cnt;
    }
}
