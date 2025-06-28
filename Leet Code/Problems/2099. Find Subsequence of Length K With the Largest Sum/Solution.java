class Solution
{
    public int[] maxSubsequence(int[] nums, int k)
    {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(b[1],a[1]));
        IntStream.range(0,nums.length).forEach(i->pq.add(new int[]{i,nums[i]}));
        return IntStream.range(0,k).mapToObj(i->pq.remove()).sorted((a,b)->Integer.compare(a[0],b[0])).mapToInt(a->a[1]).toArray();
    }
}
