class Solution
{
    public boolean canReach(int[] arr, int start)
    {
        boolean flg[] = new boolean[arr.length];
        Queue<Integer> bfs = new LinkedList<>();
        for(bfs.add(start),flg[start]=true;!bfs.isEmpty();)
        {
            int i=bfs.remove();
            if(arr[i]==0)
            {
                return true;
            }
            IntStream.of(i+arr[i],i-arr[i]).filter(in->in>=0 && in<arr.length && !flg[in]).forEach(in->{bfs.add(in);flg[in]=true;});
        }
        return false;
    }
}
