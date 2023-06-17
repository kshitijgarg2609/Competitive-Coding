class Solution
{
    public int[] sortArrayByParity(int[] nums)
    {
        return IntStream.concat(Arrays.stream(nums).filter(n->n%2==0),Arrays.stream(nums).filter(n->n%2==1)).toArray();
    }
}
