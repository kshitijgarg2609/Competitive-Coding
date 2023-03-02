class Solution
{
    public String licenseKeyFormatting(String s, int k)
    {
        StringBuilder sb = new StringBuilder();
        int cnt=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!='-')
            {
                sb.append(Character.toUpperCase(s.charAt(i)));
                cnt++;
                if(cnt%k==0)
                {
                    sb.append('-');
                }
            }
        }
        sb.reverse();
        if(sb.length()>0 && sb.charAt(0)=='-')
        {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
