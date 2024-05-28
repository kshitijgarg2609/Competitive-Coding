class Solution
{
    public int equalSubstring(String s, String t, int maxCost)
    {
        int max=0;
        for(int i=0,j=0,cost=0;i<s.length();i++)
        {
            cost+=Math.abs(s.charAt(i)-t.charAt(i));
            for(;cost>maxCost;cost-=Math.abs(s.charAt(j)-t.charAt(j++)));
            max=Integer.max(max,i-j+1);
        }
        return max;
    }
}
