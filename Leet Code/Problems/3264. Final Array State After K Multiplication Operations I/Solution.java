class Solution
{
    public int[] getFinalState(int[] nums, int k, int multiplier)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->nums[a]!=nums[b]?Integer.compare(nums[a],nums[b]):Integer.compare(a,b));
        IntStream.range(0,nums.length).forEach(i->pq.add(i));
        for(int i=1;i<=k;i++)
        {
            nums[pq.peek()]*=multiplier;
            pq.add(pq.remove());
        }
        return nums;
    }
}
