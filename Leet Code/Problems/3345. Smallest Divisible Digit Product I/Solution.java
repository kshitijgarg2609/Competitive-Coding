class Solution
{
    public int smallestNumber(int n, int t)
    {
        for(;Integer.toString(n).chars().map(c->c-'0').reduce(1,(a,b)->a*b)%t!=0;n++);
        return n;
    }
}
