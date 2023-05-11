class Solution
{
    public int maxUncrossedLines(int[] nums1, int[] nums2)
    {
        List<List<Integer>> dp = new ArrayList<>(){{add(new ArrayList<>());}};
        IntStream.rangeClosed(0,nums2.length).forEach(x->dp.get(0).add(0));
        for(int i=1;i<=nums1.length;i++)
        {
            dp.add(new ArrayList<>());
            dp.get(1).add(0);
            for(int j=1;j<=nums2.length;j++)
            {
                if(nums1[i-1]==nums2[j-1])
                {
                    dp.get(1).add(dp.get(0).get(j-1)+1);
                }
                else
                {
                    dp.get(1).add(Integer.max(dp.get(0).get(j),dp.get(1).get(j-1)));
                }
            }
            dp.remove(0);
        }
        return dp.get(0).get(nums2.length);
    }
}
