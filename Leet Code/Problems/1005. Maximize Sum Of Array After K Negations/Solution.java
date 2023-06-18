class Solution
{
    public int largestSumAfterKNegations(int[] nums, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        IntStream.range(0,nums.length).forEach(i->pq.add(nums[i]));
        while(k>0 && pq.peek()<0)
        {
            pq.add(-1*pq.poll());
            k--;
        }
        if(k%2==1)
        {
            pq.add(-1*pq.poll());
        }
        return pq.stream().mapToInt(Integer::intValue).sum();
    }
}
