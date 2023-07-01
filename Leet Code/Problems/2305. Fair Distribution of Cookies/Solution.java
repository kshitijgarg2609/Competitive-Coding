class Solution
{
    public int distributeCookies(int[] cookies, int k)
    {
        return distributeCookies(cookies,k,0,k,new int[k]);
    }
    public int distributeCookies(int[] cookies, int k, int i, int zeros, int[] dist)
    {
        int ans=Integer.MAX_VALUE;
        if(cookies.length-i<zeros)
        {
            return ans;
        }
        if(i==cookies.length)
        {
            return Arrays.stream(dist).max().getAsInt();
        }
        for(int j=0;j<k;j++)
        {
            dist[j]+=cookies[i];
            ans=Integer.min(ans,distributeCookies(cookies,k,i+1,(dist[j]==cookies[i])?zeros-1:zeros,dist));
            dist[j]-=cookies[i];
        }
        return ans;
    }
}
