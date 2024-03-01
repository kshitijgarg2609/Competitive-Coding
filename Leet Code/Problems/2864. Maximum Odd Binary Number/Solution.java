class Solution
{
    public String maximumOddBinaryNumber(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                sb.insert(0,s.charAt(i));
            }
            else
            {
                sb.append(s.charAt(i));
            }
        }
        if(sb.charAt(0)=='1')
        {
            sb.deleteCharAt(0);
            sb.append('1');
        }
        return sb.toString();
    }
}
