class Solution
{
    public int largestAltitude(int[] gain)
    {
        int a=0;
        int b=0;
        int max=0;
        for(int g : gain)
        {
            b=a+g;
            max=Integer.max(max,b);
            a=b;
        }
        return max;
    }
}
