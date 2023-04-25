class Solution
{
    public int lastStoneWeight(int[] stones)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Arrays.stream(stones).forEach(x->pq.add(x));
        while(pq.size()>1)
        {
            pq.add(pq.poll()-pq.poll());
        }
        return pq.poll();
    }
}
