class Solution
{
    public int[] closestPrimes(int left, int right)
    {
        int ans[] = new int[]{-1,-1};
        Deque<Integer> dq = new LinkedList<>();
        for(int gap=Integer.MAX_VALUE,n=left;n<=right && gap>2;n++)
        {
            if((n<2) || (n>2 && n%2==0))
            {
                continue;
            }
            int cnt=0;
            for(int d=3;d*d<=n && cnt<=1;cnt+=((n%d++==0)?1:0));
            if(cnt==0)
            {
                dq.add(n);
                if(dq.size()==1)
                {
                    continue;
                }
                if((dq.peekLast()-dq.peekFirst())<gap)
                {
                    gap=dq.peekLast()-dq.peekFirst();
                    ans=new int[]{dq.peekFirst(),dq.peekLast()};
                }
                dq.removeFirst();
            }
        }
        return ans;
    }
}
