class Solution
{
    public int findMaxK(int[] nums)
    {
        Arrays.sort(nums);
        int ans=-1;
        for(int l=0,r=nums.length-1;l<r;)
        {
            if(-nums[l]<nums[r])
            {
                r--;
            }
            else if(-nums[l]>nums[r])
            {
                l++;
            }
            else
            {
                ans=nums[r];
                break;
            }
        }
        return ans;
    }
}
