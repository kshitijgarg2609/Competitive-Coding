class Solution
{
    public int arithmeticTriplets(int[] nums, int diff)
    {
        int cnt=0;
        System.out.println("diff="+diff);
        for(int i=1;i<nums.length-1;i++)
        {
            if(Arrays.binarySearch(nums,0,i,nums[i]-diff)>-1 && Arrays.binarySearch(nums,i+1,nums.length,nums[i]+diff)>-1)
            {
                cnt++;
            }
        }
        return cnt;
    }
}
