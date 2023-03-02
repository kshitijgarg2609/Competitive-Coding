class Solution
{
    public int findContentChildren(int[] g, int[] s)
    {
        Arrays.sort(g);
        Arrays.sort(s);
        int i,j;
        for(i=0,j=0;i<g.length && j<s.length;j++)
        {
            if(s[j]>=g[i])
            {
                i++;
            }
        }
        return i;
    }
}
