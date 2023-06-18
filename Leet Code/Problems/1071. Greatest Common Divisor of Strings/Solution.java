class Solution
{
    public String gcdOfStrings(String str1, String str2)
    {
        if(!(str1+str2).equals(str2+str1))
        {
            return "";
        }
        int a=str1.length();
        int b=str2.length();
        while(a!=b)
        {
            if(a>b)
            {
                a-=b;
            }
            else if(a<b)
            {
                b-=a;
            }
        }
        return str1.substring(0,a);
    }
}
