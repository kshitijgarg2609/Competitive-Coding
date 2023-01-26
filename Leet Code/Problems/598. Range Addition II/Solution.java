class Solution
{
    public int maxCount(int m, int n, int[][] ops)
    {
        int min_m=m;
        int min_n=n;
        for(int op[] : ops)
        {
            min_m=Integer.min(min_m,op[0]);
            min_n=Integer.min(min_n,op[1]);
        }
        return (min_m*min_n);
    }
}
