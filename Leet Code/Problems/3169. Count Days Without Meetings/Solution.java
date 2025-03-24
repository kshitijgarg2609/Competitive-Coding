class Solution
{
    public int countDays(int days, int[][] meetings)
    {
        int cnt=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(m->m[0])){{add(new int[]{days+1,Integer.MAX_VALUE});}};
        Arrays.stream(meetings).forEach(m->pq.add(m));
        for(int start=0;!pq.isEmpty();)
        {
            cnt+=Integer.max(0,pq.peek()[0]-start-1);
            start=Integer.max(start,pq.remove()[1]);
        }
        return cnt;
    }
}
