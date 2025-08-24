class Solution
{
    public int longestSubarray(int[] nums)
    {
        int max=0;
        List<Integer> list = new LinkedList<>(Arrays.asList(-1,-1,-1));
        while(list.get(2)<nums.length)
        {
            list.add(IntStream.range(list.get(2)+1,nums.length).filter(i->nums[i]==0).findFirst().orElse(nums.length));
            list.remove(0);
            max=Integer.max(max,list.get(2)-list.get(0)-2);
        }
        return max;
    }
}
