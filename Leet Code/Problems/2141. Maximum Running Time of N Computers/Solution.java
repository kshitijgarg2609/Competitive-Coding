class Solution
{
    public long maxRunTime(int n, int[] batteries)
    {
        long left=0;
        long right=Arrays.stream(batteries).asLongStream().sum();
        long answer=0;
        while(left<=right)
        {
            long mid=(left+right)/2;
            if(Arrays.stream(batteries).asLongStream().map(x->((x<mid)?x:mid)).sum()>=(mid*n))
            {
                left=(answer=mid)+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return answer;
    }
}
