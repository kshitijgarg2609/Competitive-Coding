class Solution
{
    public long pickGifts(int[] gifts, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int gift : gifts)
        {
            pq.add(gift);
        }
        for(int i=1;i<=k;i++)
        {
            pq.add((int)(Math.floor(Math.sqrt(pq.remove()))));
        }
        return pq.stream().mapToLong(Integer::longValue).sum();
    }
}
