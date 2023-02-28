class Solution
{
    public int lengthOfLastWord(String s)
    {
        int len=0;
        for(String w : s.trim().split("\\s+"))
        {
            len=w.length();
        }
        return len;
    }
}
