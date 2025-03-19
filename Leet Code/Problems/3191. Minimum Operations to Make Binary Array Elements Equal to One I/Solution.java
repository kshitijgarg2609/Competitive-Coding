class Solution
{
    public int minOperations(int[] nums)
    {
        int cnt=0;
        for(int i=0;i<nums.length-3+1;i++)
        {
            if(nums[i]==0)
            {
                nums[i]=1;
                nums[i+1]=(nums[i+1]+1)%2;
                nums[i+2]=(nums[i+2]+1)%2;
                cnt++;
            }
        }
        for(int i=nums.length-3;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                return -1;
            }
        }
        return cnt;
    }
}
