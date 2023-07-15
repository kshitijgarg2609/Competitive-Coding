class Solution
{
    public int maxEvents(int[][] events)
    {
        Arrays.sort(events,(a,b)->(a[0]!=b[0])?Integer.compare(a[0],b[0]):Integer.compare(a[1],b[1]));
        int total=0;
        int e=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int d=events[0][0];d<=events[events.length-1][1] || !pq.isEmpty();d++)
        {
            while(e<events.length && d==events[e][0])
            {
                pq.add(events[e++][1]);
            }
            while(!pq.isEmpty() && d>pq.peek())
            {
                pq.poll();
            }
            if(!pq.isEmpty())
            {
                total++;
                pq.poll();
            }
        }
        return total;
    }
}
