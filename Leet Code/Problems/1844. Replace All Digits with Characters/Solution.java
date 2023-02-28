class Solution
{
    public String replaceDigits(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;(i+1)<s.length();i+=2)
        {
            sb.setCharAt((i+1),(char)(sb.charAt(i)+sb.charAt(i+1)-'0'));
        }
        return sb.toString();
    }
}
