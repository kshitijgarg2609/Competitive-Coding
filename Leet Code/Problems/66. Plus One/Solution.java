class Solution
{
    public int[] plusOne(int[] digits)
    {
        int carry=1;
        for(int i=digits.length-1;i>=0;i--)
        {
            int sum=digits[i]+carry;
            digits[i]=sum%10;
            carry=sum/10;
        }
        if(carry!=0)
        {
            int digits_new[] = new int[digits.length+1];
            digits_new[0]=carry;
            System.arraycopy(digits,0,digits_new,1,digits.length);
            return digits_new;
        }
        return digits;
    }
}
