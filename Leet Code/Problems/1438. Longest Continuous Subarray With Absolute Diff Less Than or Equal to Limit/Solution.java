class Solution
{
    public int longestSubarray(int[] nums, int limit)
    {
        int max=0;
        PriorityQueue<Integer> pq_min = new PriorityQueue<>();
        PriorityQueue<Integer> pq_max = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0,j=0;i<nums.length;i++)
        {
            pq_min.add(nums[i]);
            pq_max.add(nums[i]);
            while((pq_max.peek()-pq_min.peek())>limit)
            {
                pq_min.remove(nums[j]);
                pq_max.remove(nums[j]);
                j++;
            }
            max=Integer.max(max,i-j+1);
        }
        return max;
    }
}
