class Solution
{
    public int maxWidthRamp(int[] nums)
    {
        int min=nums.length,max=0;
        for(int indx : IntStream.range(0,nums.length).boxed().sorted((i,j)->nums[i]!=nums[j]?Integer.compare(nums[i],nums[j]):Integer.compare(i,j)).toList())
        {
            max=Integer.max(max,indx-min);
            min=Integer.min(min,indx);
        }
        return max;
    }
}
