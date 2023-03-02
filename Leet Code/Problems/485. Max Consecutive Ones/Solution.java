class Solution
{
    public int findMaxConsecutiveOnes(int[] nums)
    {
        int i=0;
        int max=0;
        while(i<nums.length)
        {
            int j=i;
            while(i<nums.length && nums[i]==1)
            {
                i++;
            }
            max=Integer.max(max,i-j);
            i++;
        }
        return max;
    }
}
