class Solution
{
    public int maxTwoEvents(int[][] events)
    {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]==b[0]?Integer.compare(a[2],b[2]):Integer.compare(a[0],b[0]));
        for(int event[] : events)
        {
            pq.add(new int[]{event[0],event[2],1});
            pq.add(new int[]{event[1]+1,event[2],0});
        }
        int ans=0;
        for(int max=0;!pq.isEmpty();)
        {
            int arr[] = pq.remove();
            if(arr[2]==1)
            {
                ans=Integer.max(ans,arr[1]+max);
            }
            else
            {
                max=Integer.max(max,arr[1]);
            }
        }
        return ans;
    }
}
