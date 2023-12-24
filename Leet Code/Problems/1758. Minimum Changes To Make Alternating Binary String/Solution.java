class Solution
{
    public int minOperations(String s)
    {
        int z=0,o=0;
        for(int i=0;i<s.length();i++)
        {
            if((i%2==0 && s.charAt(i)!='0') || (i%2==1 && s.charAt(i)!='1'))
            {
                z++;
            }
            if((i%2==0 && s.charAt(i)!='1') || (i%2==1 && s.charAt(i)!='0'))
            {
                o++;
            }
        }
        return Integer.min(z,o);
    }
}
