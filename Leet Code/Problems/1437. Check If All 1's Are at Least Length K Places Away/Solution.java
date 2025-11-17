class Solution
{
    public boolean kLengthApart(int[] nums, int k)
    {
        for(int i=0,j=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                if(j>0)
                {
                    return false;
                }
                j=k;
            }
            else
            {
                j--;
            }
        }
        return true;
    }
}
