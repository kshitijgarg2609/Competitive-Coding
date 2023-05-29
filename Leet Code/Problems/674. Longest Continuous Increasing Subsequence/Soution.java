class Solution
{
    public int findLengthOfLCIS(int[] nums)
    {
        int max=0;
        int i=0;
        while(i<nums.length)
        {
            int j=i;
            while((i+1)<nums.length && nums[i]<nums[i+1])
            {
                i++;
            }
            max=Integer.max(max,i++-j+1);  
        }
        return max;
    }
}
