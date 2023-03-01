class Solution
{
    public boolean isPalindrome(String s)
    {
        StringBuilder sb = new StringBuilder();
        s.chars().filter(x->Character.isLetterOrDigit(x)).forEach(x->sb.append(Character.toLowerCase((char)x)));
        for(int i=0;i<(sb.length()/2);i++)
        {
            if(sb.charAt(i)!=sb.charAt(sb.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
}
