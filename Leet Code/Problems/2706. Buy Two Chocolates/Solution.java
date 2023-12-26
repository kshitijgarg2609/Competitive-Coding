class Solution
{
    public int buyChoco(int[] prices, int money)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int price : prices)
        {
            pq.add(price);
            if(pq.size()>2)
            {
                pq.poll();
            }
        }
        int cost=pq.poll()+pq.poll();
        return money-(cost>money?0:cost);
    }
}
