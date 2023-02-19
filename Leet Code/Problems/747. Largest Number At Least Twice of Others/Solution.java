class Solution
{
    public int dominantIndex(int[] nums)
    {
        int largest_indx=(nums[0]>nums[1])?0:1;
        int second_largest_indx=(largest_indx+1)%2;
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i]>nums[largest_indx])
            {
                second_largest_indx=largest_indx;
                largest_indx=i;
            }
            else if(nums[i]>nums[second_largest_indx])
            {
                second_largest_indx=i;
            }
        }
        return ((2*nums[second_largest_indx])>nums[largest_indx])?-1:largest_indx;
    }
}
