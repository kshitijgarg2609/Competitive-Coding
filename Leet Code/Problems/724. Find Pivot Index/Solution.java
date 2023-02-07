class Solution
{
    public int pivotIndex(int[] nums)
    {
        int left=0;
        int right=Arrays.stream(nums).sum();
        int indx=-1;
        for(int i=0;i<nums.length;i++)
        {
            right-=nums[i];
            if(left==right)
            {
                indx=i;
                break;
            }
            left+=nums[i];
        }
        return indx;
    }
}
