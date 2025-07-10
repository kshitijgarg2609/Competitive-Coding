class Solution
{
    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime)
    {
        int max=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<=startTime.length;i++)
        {
            pq.add((i==startTime.length?eventTime:startTime[i])-(i==0?0:endTime[i-1]));
            if(pq.size()>3)
            {
                pq.remove();
            }
        }
        for(int i=0;i<startTime.length;i++)
        {
            int left=startTime[i]-((i==0)?0:endTime[i-1]);
            int right=((i==startTime.length-1)?eventTime:startTime[i+1])-endTime[i];
            if(left==0 && right==0)
            {
                continue;
            }
            IntStream.of(left,right).forEach(e->pq.remove(e));
            int ftime=left+right;
            for(int p : pq)
            {
                if(endTime[i]-startTime[i]<=p)
                {
                    ftime+=endTime[i]-startTime[i];
                    break;
                }
            }
            max=Integer.max(max,ftime);
            IntStream.of(left,right).forEach(e->pq.add(e));
            IntStream.range(0,pq.size()-3).forEach(e->pq.remove());
        }
        return max;
    }
}
