class Solution
{
    public int findLongestChain(int[][] pairs)
    {
        Arrays.sort(pairs,(a,b)->Integer.compare(a[1],b[1]));
        int cnt=0,selected=Integer.MIN_VALUE;
        for(int p[] : pairs)
        {
            if(p[0]>selected)
            {
                cnt++;
                selected=p[1];
            }
        }
        return cnt;
    }
}
