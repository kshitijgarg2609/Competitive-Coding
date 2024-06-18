class Solution
{
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker)
    {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(b[1],a[1]));
        for(int i=0;i<difficulty.length;i++)
        {
            pq.add(new int[]{difficulty[i],profit[i]});
        }
        Arrays.sort(worker);
        int cnt=0;
        for(int i=worker.length-1;i>=0 && !pq.isEmpty();)
        {
            if(worker[i]<pq.peek()[0])
            {
                pq.poll();
            }
            else
            {
                cnt+=pq.peek()[1];
                i--;
            }
        }
        return cnt;
    }
}
