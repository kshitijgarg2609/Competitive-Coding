class Solution
{
    public String countAndSay(int n)
    {
        if(n==1)
        {
            return "1";
        }
        String str = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();)
        {
            char c=str.charAt(i++);
            int len=1;
            for(;i<str.length() && str.charAt(i)==c;i++,len++);
            sb.append(len);
            sb.append(c);
        }
        return sb.toString();
    }
}
