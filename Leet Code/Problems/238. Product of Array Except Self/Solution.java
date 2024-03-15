class Solution
{
    public int[] productExceptSelf(int[] nums)
    {
        long product=1L,product_non_zero=1L;
        for(int num : nums)
        {
            if(num==0 && product==0)
            {
                return new int[nums.length];
            }
            else if(num!=0)
            {
                product_non_zero*=num;
            }
            product*=num;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                nums[i]=(int)(product_non_zero);
            }
            else
            {
                int num=nums[i];
                product/=(long)num;
                nums[i]=(int)(product);
                product*=(long)num;
            }
        }
        return nums;
    }
}
