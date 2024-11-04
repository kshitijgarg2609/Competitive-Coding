class Solution
{
    public String compressedString(String word)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<word.length();)
        {
            char c=word.charAt(i++);
            int cnt=1;
            for(;i<word.length() && c==word.charAt(i) && cnt<9;cnt++,i++);
            sb.append(cnt).append(c);
        }
        return sb.toString();
    }
}
