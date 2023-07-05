class Solution
{
    public int longestSubarray(int[] nums)
    {
        int start=0;
        int zero=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            zero+=((nums[i]==0)?1:0);
            while(zero>1)
            {
                zero-=((nums[start++]==0)?1:0);
            }
            max=Integer.max(max,i-start);
        }
        return max;
    }
}
