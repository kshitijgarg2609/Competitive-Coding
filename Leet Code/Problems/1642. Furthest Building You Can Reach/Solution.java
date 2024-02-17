class Solution
{
    public int furthestBuilding(int[] heights, int bricks, int ladders)
    {
        int b=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=1;i<heights.length;i++)
        {
            if(heights[i-1]>=heights[i])
            {
                b=i;
                continue;
            }
            pq.add(heights[i]-heights[i-1]);
            if(pq.size()>ladders)
            {
                if(bricks>=pq.peek())
                {
                    bricks-=pq.poll();
                }
                else
                {
                    break;
                }
            }
            b=i;
        }
        return b;
    }
}
