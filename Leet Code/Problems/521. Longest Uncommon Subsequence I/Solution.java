class Solution
{
    public int findLUSlength(String a, String b)
    {
        if(a.equals(b))
        {
            return -1;
        }
        return Integer.max(a.length(),b.length());
    }
}
