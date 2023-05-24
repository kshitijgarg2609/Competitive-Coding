class Solution
{
    public long maxScore(int[] nums1, int[] nums2, int k)
    {
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(nums1.length,(a,b)->Integer.compare(b.get(1),a.get(1)));
        for(int i=0;i<nums1.length;i++)
        {
            pq.add(Arrays.asList(nums1[i],nums2[i]));
        }
        long sum=0;
        long max_score=0;
        PriorityQueue<Integer> max_sum = new PriorityQueue<>(k+1);
        while(!pq.isEmpty())
        {
            List<Integer> li = pq.poll();
            max_sum.add(li.get(0));
            sum+=li.get(0);
            if(max_sum.size()>k)
            {
                sum-=max_sum.poll();
            }
            if(max_sum.size()==k)
            {
                max_score=Long.max(max_score,sum*li.get(1));
            }
        }
        return max_score;
    }
}
