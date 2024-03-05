class Solution
{
    public int minimumLength(String s)
    {
        int del=0;
        for(int l=0,r=s.length()-1;l<r && s.charAt(l)==s.charAt(r);)
        {
            for(char c=s.charAt(l);l<=r && c==s.charAt(l);l++,del++);
            for(char c=s.charAt(r);l<r && c==s.charAt(r);r--,del++);
        }
        return s.length()-del;
    }
}
