class Solution
{
    public int maxIceCream(int[] costs, int coins)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.stream(costs).forEach(c->pq.add(c));
        int i=0;
        for(;!pq.isEmpty() && coins>=pq.peek();coins-=pq.remove(),i++);
        return i;
    }
}
