class Solution
{
    public String reverseStr(String s, int k)
    {
        StringBuffer sb = new StringBuffer();
        int rev_indx=0,cnt=0;
        boolean rev_flg=false;
        for(char c : s.toCharArray())
        {
            if(cnt%k==0)
            {
                rev_flg=!rev_flg;
                rev_indx=cnt;
            }
            if(rev_flg)
            {
                sb.insert(rev_indx,c);
            }
            else
            {
                sb.append(c);
            }
            cnt++;
        }
        return sb.toString();
    }
}
