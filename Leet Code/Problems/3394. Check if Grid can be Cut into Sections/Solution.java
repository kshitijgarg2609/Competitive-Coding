class Solution
{
    public boolean checkValidCuts(int n, int[][] rectangles)
    {
        List<PriorityQueue<int[]>> list = new LinkedList<>();
        list.add(new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0])));
        list.add(new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0])));
        for(int r[] : rectangles)
        {
            list.get(0).add(new int[]{r[0],r[2]});
            list.get(1).add(new int[]{r[1],r[3]});
        }
        for(PriorityQueue<int[]> pq : list)
        {
            for(int start=pq.remove()[1],cut=0;!pq.isEmpty();)
            {
                int c[] = pq.remove();
                if(start<=c[0] && ++cut==2)
                {
                    return true;
                }
                start=Integer.max(start,c[1]);
            }
        }
        return false;
    }
}
