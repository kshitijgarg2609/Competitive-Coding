class Solution
{
    public int minGroups(int[][] intervals)
    {
        int max=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]!=b[0]?Integer.compare(a[0],b[0]):Integer.compare(a[1],b[1]));
        for(int intr[] : intervals)
        {
            pq.add(new int[]{intr[0],1});
            pq.add(new int[]{intr[1]+1,-1});
        }
        for(int log=0;!pq.isEmpty();)
        {
            max=Integer.max(max,log+=pq.remove()[1]);
        }
        return max;
    }
}
