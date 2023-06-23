class Solution
{
    public int longestArithSeqLength(int[] nums)
    {
        int max=0;
        List<Map<Integer,Integer>> list = new ArrayList<>(nums.length);
        IntStream.range(0,nums.length).forEach(x->list.add(new HashMap<>()));
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int diff=nums[i]-nums[j];
                int cnt=list.get(i).getOrDefault(diff,1);
                cnt++;
                list.get(j).put(diff,cnt);
                max=Integer.max(max,cnt);
            }
        }
        return max;
    }
}
