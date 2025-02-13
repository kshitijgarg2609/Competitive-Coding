class Solution
{
    public int minOperations(int[] nums, int k)
    {
        int cnt=0;
        PriorityQueue<Long> pq = new PriorityQueue<>(){{for(int i=0;i<nums.length;add((long)nums[i++]));}};
        for(;pq.peek()<k;pq.add(pq.peek()+pq.remove()+pq.remove()),cnt++);
        return cnt;
    }
}
