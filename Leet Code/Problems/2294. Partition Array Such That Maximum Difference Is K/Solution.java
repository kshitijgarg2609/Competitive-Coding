class Solution
{
    public int partitionArray(int[] nums, int k)
    {
        int cnt=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;cnt++)
        {
            for(int num=nums[i++];i<nums.length && nums[i]-num<=k;i++);
        }
        return cnt;
    }
}
