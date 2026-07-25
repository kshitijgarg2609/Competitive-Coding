class Solution
{
    public int maxProduct(int n)
    {
        int d[] = Integer.toString(n).chars().map(c->c-'0').toArray();
        Arrays.sort(d);
        return d[d.length-1]*d[d.length-2];
    }
}
