class Solution
{
    public int[] kthSmallestPrimeFraction(int[] arr, int k)
    {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Double.compare((1.0*arr[a[0]])/arr[a[1]],(1.0*arr[b[0]])/arr[b[1]]));
        for(int i=0;i<arr.length-1;pq.add(new int[]{i++,arr.length-1}));
        for(int i=1;i<k;i++)
        {
            int frac[] = pq.remove();
            if(frac[0]<--frac[1])
            {
                pq.add(frac);
            }
        }
        return new int[]{arr[pq.peek()[0]],arr[pq.peek()[1]]};
    }
}
