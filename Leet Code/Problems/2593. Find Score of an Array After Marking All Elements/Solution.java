class Solution
{
    public long findScore(int[] nums)
    {
        boolean vis[] = new boolean[nums.length];
        List<Integer> list = IntStream.range(0,vis.length).boxed().sorted((a,b)->nums[a]==nums[b]?Integer.compare(a,b):Integer.compare(nums[a],nums[b])).collect(Collectors.toList());
        long sum=0L;
        for(int indx : list)
        {
            if(vis[indx])
            {
                continue;
            }
            sum+=nums[indx];
            for(int i : new int[]{indx-1,indx,indx+1})
            {
                if(i>=0 && i<vis.length)
                {
                    vis[i]=true;
                }
            }
        }
        return sum;
    }
}
