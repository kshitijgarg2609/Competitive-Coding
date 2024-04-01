class Solution
{
    public int lengthOfLastWord(String s)
    {
        int i=s.length()-1,len=0;
        for(;i>=0 && s.charAt(i)==' ';i--);
        for(;i>=0 && s.charAt(i)!=' ';i--,len++);
        return len;
    }
}
