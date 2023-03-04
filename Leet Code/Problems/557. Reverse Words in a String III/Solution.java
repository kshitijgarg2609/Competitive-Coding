class Solution
{
    public String reverseWords(String s)
    {
        StringBuffer sb = new StringBuffer();
        for(String w : s.split(" "))
        {
            sb.append((new StringBuffer(w)).reverse().toString());
            sb.append(' ');
        }
        return sb.toString().trim();
    }
}
