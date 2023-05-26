class Solution
{
    public int[] findErrorNums(int[] nums)
    {
        int ans[] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int j=i;
            while(nums[nums[j]-1]!=nums[j])
            {
                int tmp=nums[nums[j]-1];
                nums[nums[j]-1]=nums[j];
                nums[j]=tmp;
            }
            if(nums[i]!=i+1)
            {
                ans[0]=nums[i];
                ans[1]=i+1;
            }
        }
        return ans;
    }
}
