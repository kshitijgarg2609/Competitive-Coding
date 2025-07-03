class Solution
{
    public char kthCharacter(int k)
    {
        StringBuilder sb = new StringBuilder("a");
        while(sb.length()<k)
        {
            for(int i=0,l=sb.length();i<l;i++)
            {
                sb.append((char)('a'+((sb.charAt(i)-'a'+1+26)%26)));
            }
        }
        return sb.charAt(k-1);
    }
}
