class Solution
{
    public int minMoves(int[] nums)
    {
        Integer max = Arrays.stream(nums).max().getAsInt();
        return Arrays.stream(nums).map(n->max-n).sum();
    }
}
