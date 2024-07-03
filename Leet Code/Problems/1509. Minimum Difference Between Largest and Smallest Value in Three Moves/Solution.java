class Solution
{
    public int minDifference(int[] nums)
    {
        if(nums.length<=4)
        {
            return 0;
        }
        int d=Integer.MAX_VALUE;
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums)
        {
            for(PriorityQueue<Integer> pq : Arrays.asList(min,max))
            {
                pq.add(num);
                if(pq.size()>4)
                {
                    pq.poll();
                }
            }
        }
        List<Integer> min_values = min.stream().sorted().collect(Collectors.toList());
        List<Integer> max_values = max.stream().sorted().collect(Collectors.toList());
        for(int i=0;i<min_values.size();i++)
        {
            d=Integer.min(d,Math.abs(max_values.get(i)-min_values.get(i)));
        }
        return d;
    }
}
