class Solution
{
    public int numSubarraysWithSum(int[] nums, int goal)
    {
        int cnt=0;
        int arr[] = new int[nums.length+1];
        for(int i=0,sum=0;i<nums.length;i++)
        {
            if((sum+=nums[i])>=goal)
            {
                cnt+=arr[sum-goal]+((sum==goal)?1:0);
            }
            arr[sum]++;
        }
        return cnt;
    }
}
