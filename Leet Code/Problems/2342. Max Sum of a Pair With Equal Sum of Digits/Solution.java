class Solution
{
    public int maximumSum(int[] nums)
    {
        Map<Integer,PriorityQueue<Integer>> map = new HashMap<>();
        for(int num : nums)
        {
            int dsum=Integer.toString(num).chars().map(c->c-'0').sum();
            map.computeIfAbsent(dsum,k->new PriorityQueue<>()).add(num);
            if(map.get(dsum).size()>2)
            {
                map.get(dsum).remove();
            }
        }
        return map.values().stream().filter(pq->pq.size()==2).mapToInt(pq->pq.remove()+pq.remove()).max().orElse(-1);
    }
}
