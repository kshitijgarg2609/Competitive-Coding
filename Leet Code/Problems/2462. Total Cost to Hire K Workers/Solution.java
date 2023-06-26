class Solution
{
    public long totalCost(int[] costs, int k, int candidates)
    {
        PriorityQueue<Integer> first = new PriorityQueue<>();
        PriorityQueue<Integer> last = new PriorityQueue<>();
        int f,l;
        for(f=0,l=costs.length-1;f<candidates;)
        {
            first.add(costs[f++]);
            if(l>=Math.max(candidates, costs.length - candidates))
            {
                last.add(costs[l--]);
            }
        }
        long ans=0;
        for(int i=0;i<k;i++)
        {
            if(last.isEmpty() || (!first.isEmpty() && first.peek()<=last.peek()))
            {
                ans+=first.poll();
                if(f<=l)
                {
                    first.add(costs[f++]);
                }
            }
            else
            {
                ans+=last.poll();
                if(f<=l)
                {
                    last.add(costs[l--]);
                }
            }
        }
        return ans;
    }
}
