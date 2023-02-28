class Solution
{
    public int[] frequencySort(int[] nums)
    {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[1]==b[1])?Integer.compare(b[0],a[0]):Integer.compare(a[1],b[1]));
        for(Map.Entry<Integer,Long> ob : Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet())
        {
            pq.add(new int[]{ob.getKey().intValue(),ob.getValue().intValue()});
        }
        int i=0;
        int nxt[];
        while((nxt=pq.poll())!=null)
        {
            Arrays.fill(nums,i,i+nxt[1],nxt[0]);
            i+=nxt[1];
        }
        return nums;
    }
}
