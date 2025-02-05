class Solution
{
    public boolean areAlmostEqual(String s1, String s2)
    {
        int cnt=0,f=0,l=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                if(++cnt==1)
                {
                    f=i;
                }
                else if(cnt==2)
                {
                    l=i;
                }
                else
                {
                    return false;
                }
            }
        }
        return s1.charAt(f)==s2.charAt(l) && s1.charAt(l)==s2.charAt(f);
    }
}
