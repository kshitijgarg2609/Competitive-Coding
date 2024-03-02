class Solution
{
    public int[] sortedSquares(int[] nums)
    {
        int ans[] = new int[nums.length];
        for(int i=nums.length-1,left=0,right=i;i>=0;i--)
        {
            ans[i]=(nums[left]*nums[left]>nums[right]*nums[right])?nums[left]*nums[left++]:nums[right]*nums[right--];
        }
        return ans;
    }
}
