class Solution
{
    public int reverse(int x)
    {
        StringBuilder sb = new StringBuilder();
        boolean minus=false;
        for(char c : Integer.toString(x).toCharArray())
        {
            if(c=='-')
            {
                minus=true;
            }
            else
            {
                sb.insert(0,c);
            }
        }
        for(;sb.length()>1 && sb.charAt(0)=='0';sb.deleteCharAt(0));
        if(minus)
        {
            sb.insert(0,'-');
        }
        Long value=Long.valueOf(sb.toString());
        return (value==value.intValue())?value.intValue():0;
    }
}
