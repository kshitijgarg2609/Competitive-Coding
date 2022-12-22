class Solution
{
    public String addBinary(String a, String b)
    {
        StringBuffer bin = new StringBuffer();
        int len_a=a.length();
        int i=len_a-1;
        int len_b=b.length();
        int j=len_b-1;
        int carry=0;
        while(i>=0 || j>=0)
        {
            int char_a=0;
            int char_b=0;
            if(i>=0)
            {
                char_a=(a.charAt(i--)-'0');
            }
            if(j>=0)
            {
                char_b=(b.charAt(j--)-'0');
            }
            int sum=char_a+char_b+carry;
            bin.insert(0,(char)((sum%2)+'0'));
            carry=sum/2;
        }
        if(carry!=0)
        {
            bin.insert(0,(char)(carry+'0'));
        }
        return bin.toString();
    }
}
