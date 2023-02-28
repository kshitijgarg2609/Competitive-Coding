class Solution
{
    public String longestCommonPrefix(String[] strs)
    {
        StringBuilder sb = new StringBuilder();
        int i=0;
        boolean flg=true;
        while(flg)
        {
            char c='#';
            for(String str : strs)
            {
                if(i>=str.length() || (c!='#' && c!=str.charAt(i)))
                {
                    flg=false;
                    break;
                }
                c=str.charAt(i);
            }
            i++;
            if(flg)
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
