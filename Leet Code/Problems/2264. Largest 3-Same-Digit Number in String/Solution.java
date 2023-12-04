class Solution
{
    public String largestGoodInteger(String num)
    {
        boolean vis[] = new boolean[10];
        for(int i=0;i<num.length();i++)
        {
            if(!vis[num.charAt(i)-'0'] && i+1<num.length() && num.charAt(i+1)==num.charAt(i) && i+2<num.length() && num.charAt(i+2)==num.charAt(i))
            {
                vis[num.charAt(i)-'0']=true;
            }
        }
        for(int i=vis.length-1;i>=0;i--)
        {
            if(vis[i])
            {
                return String.format("%d%d%d",i,i,i);
            }
        }
        return "";
    }
}
