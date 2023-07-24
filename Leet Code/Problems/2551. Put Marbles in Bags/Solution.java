class Solution
{
    public long putMarbles(int[] weights, int k)
    {
        if(k==1 || k==weights.length)
        {
            return 0;
        }
        PriorityQueue<Long> max = new PriorityQueue<>();
        PriorityQueue<Long> min = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=1;i<weights.length;i++)
        {
            max.add(0L+weights[i-1]+weights[i]);
            if(max.size()==k)
            {
                max.poll();
            }
            min.add(0L+weights[i-1]+weights[i]);
            if(min.size()==k)
            {
                min.poll();
            }
        }
        return max.stream().mapToLong(Long::longValue).sum()-min.stream().mapToLong(Long::longValue).sum();
    }
}
