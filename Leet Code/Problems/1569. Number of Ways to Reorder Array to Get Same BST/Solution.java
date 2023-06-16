class Solution
{
    public int numOfWays(int[] nums)
    {
        return numOfWays(Arrays.stream(nums).boxed().collect(Collectors.toList()))-1;
    }
    public int numOfWays(List<Integer> nums)
    {
        int mod=(int)(1E9+7);
        if(nums.size()<=2)
        {
            return 1;
        }
        List<Integer> left = new LinkedList<>();
        List<Integer> right = new LinkedList<>();
        Iterator<Integer> it = nums.iterator();
        int root=it.next();
        it.remove();
        while(it.hasNext())
        {
            int nxt=it.next();
            if(nxt<root)
            {
                left.add(nxt);
            }
            else
            {
                right.add(nxt);
            }
            it.remove();
        }
        int n=left.size()+right.size();
        int r=Integer.min(left.size(),right.size());
        int c[] = new int[r+1];
        c[0]=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=Integer.min(i,r);j>0;j--)
            {
                c[j]=(c[j]+c[j-1])%mod;
            }
        }
        int ch = (int)((1L*numOfWays(left)*numOfWays(right))%mod);
        return (int)((1L*c[r]*ch)%mod);
    }
}
