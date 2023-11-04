class Solution
{
    public int getLastMoment(int n, int[] left, int[] right)
    {
        return Integer.max((left.length==0)?0:Arrays.stream(left).max().getAsInt(),(right.length==0)?0:Arrays.stream(right).map(x->n-x).max().getAsInt());
    }
}
