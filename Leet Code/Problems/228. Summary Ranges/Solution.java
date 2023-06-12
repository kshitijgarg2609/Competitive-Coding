class Solution
{
    public List<String> summaryRanges(int[] nums)
    {
        List<String> list = new LinkedList<>();
        int i=0;
        while(i<nums.length)
        {
            int start=i;
            for(i++;i<nums.length && nums[i]==nums[i-1]+1;i++);
            list.add(((start+1==i)?String.format("%d",Integer.valueOf(nums[start])):String.format("%d->%d",Integer.valueOf(nums[start]),Integer.valueOf(nums[i-1]))));
        }
        return list;
    }
}
