class Solution
{
    public int minCost(String colors, int[] neededTime)
    {
        int cnt=0;
        for(int i=0;i<colors.length();)
        {
            char c=colors.charAt(i);
            for(int max=neededTime[i++];i<colors.length() && c==colors.charAt(i);i++)
            {
                cnt+=(neededTime[i]>max)?max:neededTime[i];
                max=Integer.max(max,neededTime[i]);
            }
        }
        return cnt;
    }
}
