class Solution
{
    public int minimumDifference(int[] nums, int k)
    {
        int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0,j=k-1;j<nums.length;i++,j++)
        {
            min=Integer.min(min,nums[j]-nums[i]);
        }
        return min;
    }
}
