class Solution
{
    public int numberOfArithmeticSlices(int[] nums)
    {
        int sum=0;
        for(int i=2,cnt=0;i<nums.length;i++)
        {
            if(nums[i-1]-nums[i-2]==nums[i]-nums[i-1])
            {
                sum+=++cnt;
            }
            else
            {
                cnt=0;
            }
        }
        return sum;
    }
}
