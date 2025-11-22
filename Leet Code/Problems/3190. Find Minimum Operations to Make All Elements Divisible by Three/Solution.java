class Solution
{
    public int minimumOperations(int[] nums)
    {
        return Arrays.stream(nums).map(n->((n%3==2)?1:n%3)).sum();
    }
}
