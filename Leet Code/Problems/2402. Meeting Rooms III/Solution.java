class Solution
{
    public int mostBooked(int n, int[][] meetings)
    {
        PriorityQueue<long[]> unused = new PriorityQueue<>(Comparator.<long[]>comparingLong(arr->arr[0]).thenComparingLong(arr->arr[1]));
        PriorityQueue<long[]> used = new PriorityQueue<>(Comparator.<long[]>comparingLong(arr->arr[1]).thenComparingLong(arr->arr[0]));
        int cnt[] = new int[n];
        IntStream.range(0,n).forEach(i->unused.add(new long[]{i,0}));
        Arrays.sort(meetings,(a,b)->(a[0]!=b[0])?Integer.compare(a[0],b[0]):Integer.compare(a[1],b[1]));
        for(int m[] : meetings)
        {
            for(;!used.isEmpty() && (1L*m[0])>=used.peek()[1];unused.add(used.remove()));
            if(used.size()==n)
            {
                unused.add(used.remove());
            }
            long r[] = unused.remove();
            cnt[(int)r[0]]++;
            r[1]=Long.max(r[1]+m[1]-m[0],m[1]);
            used.add(r);
        }
        int max=0,indx=0;
        for(int i=0;i<cnt.length;i++)
        {
            if(cnt[i]>max)
            {
                max=cnt[i];
                indx=i;
            }
        }
        return indx;
    }
}
