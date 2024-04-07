class Solution
{
    public boolean checkValidString(String s)
    {
        for(int i=0,o=0,c=0;i<s.length();i++)
        {
            o+=(s.charAt(i)=='(' || s.charAt(i)=='*')?1:-1;
            c+=(s.charAt(s.length()-i-1)==')' || s.charAt(s.length()-i-1)=='*')?1:-1;
            if(o<0 || c<0)
            {
                return false;
            }
        }
        return true;
    }
}
