class Solution
{
    public boolean isSubsequence(String s, String t)
    {
        int i,j;
        if(s.length()==0)
        {
            return true;
        }
        for(i=0,j=0;j<t.length();j++)
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
        return false;
    }
}
