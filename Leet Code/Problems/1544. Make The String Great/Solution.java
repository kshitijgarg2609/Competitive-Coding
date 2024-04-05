class Solution
{
    public String makeGood(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            int indx=sb.length()-1;
            if(indx>=0 && Math.abs(sb.charAt(indx)-s.charAt(i))==32)
            {
                sb.deleteCharAt(indx);
            }
            else
            {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
