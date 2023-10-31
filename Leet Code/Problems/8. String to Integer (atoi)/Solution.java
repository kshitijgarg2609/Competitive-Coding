class Solution
{
    public int myAtoi(String s)
    {
        int i=0;
        boolean minus=false;
        for(;i<s.length() && s.charAt(i)==' ';i++);
        if(i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-'))
        {
            if(s.charAt(i)=='-')
            {
                minus=true;
            }
            i++;
        }
        long value=0;
        for(;i<s.length() && Character.isDigit(s.charAt(i));i++)
        {
            value=(value*10)+s.charAt(i)-'0';
            if((minus && -value<Integer.MIN_VALUE) || value>Integer.MAX_VALUE)
            {
                return (minus)?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
        }
        if(minus)
        {
            value=-value;
        }
        return (int)(value);
    }
}
