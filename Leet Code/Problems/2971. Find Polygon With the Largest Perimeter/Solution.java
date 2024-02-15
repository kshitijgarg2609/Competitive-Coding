class Solution
{
    public long largestPerimeter(int[] nums)
    {
        long ans=-1,sum=0;
        Arrays.sort(nums);
        for(int num : nums)
        {
            if(num<sum)
            {
                ans=sum+num;
            }
            sum+=num;
        }
        return ans;
    }
}
