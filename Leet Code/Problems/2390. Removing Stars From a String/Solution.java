class Solution
{
    public String removeStars(String s)
    {
        StringBuilder sb = new StringBuilder();
        int cnt=0;
        for(char c : s.toCharArray())
        {
            if(c=='*')
            {
                cnt--;
            }
            else
            {
                if(cnt==sb.length())
                {
                    sb.append(c);
                }
                else
                {
                    sb.setCharAt(cnt,c);
                }
                cnt++;
            }
        }
        return sb.substring(0,cnt);
    }
}
