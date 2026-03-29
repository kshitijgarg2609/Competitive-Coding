class Solution
{
    public boolean canBeEqual(String s1, String s2)
    {
        char str[] = s1.toCharArray();
        for(int i=0;i<str.length;i++)
        {
            if(str[i]!=s2.charAt(i))
            {
                char tmp=str[i];
                str[i]=str[(i+2)%str.length];
                str[(i+2)%str.length]=tmp;
            }
        }
        return s2.equals(new String(str));
    }
}
