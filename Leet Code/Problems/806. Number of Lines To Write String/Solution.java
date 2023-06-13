class Solution
{
    public int[] numberOfLines(int[] widths, String s)
    {
        int ans[] = new int[]{1,0};
        for(char c : s.toCharArray())
        {
            if((ans[1]+widths[c-'a'])>100)
            {
                ans[0]++;
                ans[1]=0;
            }
            ans[1]+=widths[c-'a'];
        }
        return ans;
    }
}
