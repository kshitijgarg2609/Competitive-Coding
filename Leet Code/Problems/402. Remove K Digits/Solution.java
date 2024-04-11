class Solution
{
    public String removeKdigits(String num, int k)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<num.length();i++)
        {
            while(k>0 && sb.length()>0 && num.charAt(i)<sb.charAt(sb.length()-1))
            {
                sb.deleteCharAt(sb.length()-1);
                k--;
            }
            sb.append(num.charAt(i));
        }
        for(;sb.length()>0 && k>0;sb.deleteCharAt(sb.length()-1),k--);
        for(;sb.length()>0 && sb.charAt(0)=='0';sb.deleteCharAt(0));
        if(sb.length()==0)
        {
            sb.append('0');
        }
        return sb.toString();
    }
}
