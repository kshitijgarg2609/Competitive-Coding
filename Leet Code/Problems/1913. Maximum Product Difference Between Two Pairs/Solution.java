class Solution
{
    public int maxProductDifference(int[] nums)
    {
        List<PriorityQueue<Integer>> list = Arrays.asList(new PriorityQueue<>(),new PriorityQueue<>(Collections.reverseOrder()));
        for(int num : nums)
        {
            for(PriorityQueue<Integer> pq : list)
            {
                pq.add(num);
                if(pq.size()>2)
                {
                    pq.poll();
                }
            }
        }
        return (list.get(0).poll()*list.get(0).poll())-(list.get(1).poll()*list.get(1).poll());
    }
}
