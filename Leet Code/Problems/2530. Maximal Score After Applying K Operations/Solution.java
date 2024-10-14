class Solution
{
    public long maxKelements(int[] nums, int k)
    {
        long score=0L;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums)
        {
            pq.add(num);
        }
        for(int i=1;i<=k;i++)
        {
            int num=pq.remove();
            score+=num;
            pq.add((int)(Math.ceil(num/3.0)));
        }
        return score;
    }
}
