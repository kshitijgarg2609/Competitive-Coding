class Solution
{
    public boolean isSubsequence(String s, String t)
    {
        for(int i=0,j=0;i<s.length() && j<t.length();j++)
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
            }
            if(i==s.length())
            {
                return true;
            }
        }
        return s.length()==0;
    }
}
