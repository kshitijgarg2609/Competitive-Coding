class Solution
{
    public int countSegments(String s)
    {
        int cnt=0;
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i)==' ')
            {
                i++;
                continue;
            }
            while(i<s.length() && s.charAt(i)!=' ')
            {
                i++;
            }
            cnt++;
        }
        return cnt;
    }
}
