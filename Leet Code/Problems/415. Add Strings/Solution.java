class Solution
{
    public String addStrings(String num1, String num2)
    {
        int max_len=Integer.max(num1.length(),num2.length());
        StringBuffer buffer = new StringBuffer(max_len+1);
        int carry=0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        while(i>=0 || j>=0)
        {
            int d1=(i>=0)?(num1.charAt(i--)-'0'):0;
            int d2=(j>=0)?(num2.charAt(j--)-'0'):0;
            int sum=d1+d2+carry;
            carry=sum/10;
            buffer.append(sum%10);
        }
        if(carry==1)
        {
            buffer.append(carry);
        }
        return buffer.reverse().toString();
    }
}
