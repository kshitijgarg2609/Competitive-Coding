class Solution
{
    public int[] minBitwiseArray(List<Integer> nums)
    {
        return nums.stream().map(n->IntStream.range(1,n).filter(k->(k|(k+1))==n).findFirst().orElse(-1)).mapToInt(Integer::intValue).toArray();
    }
}
