class Solution
{
    public int[] decompressRLElist(int[] nums)
    {
        List<Integer> list = new LinkedList<>();
        for(int i=0;i<nums.length;i+=2)
        {
            list.addAll(Collections.nCopies(nums[i],Integer.valueOf(nums[i+1])));
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
