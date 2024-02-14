class Solution
{
    public int[] rearrangeArray(int[] nums)
    {
        int ans[] = new int[nums.length];
        for(int i=0,p=0,n=0;i<nums.length;i++)
        {
            ans[nums[i]>0?(2*p++):((2*n++)+1)]=nums[i];
        }
        return ans;
    }
}
