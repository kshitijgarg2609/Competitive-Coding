class Solution
{
    public int reductionOperations(int[] nums)
    {
        Arrays.sort(nums);
        int cnt=0;
        for(int i=1,e=0;i<nums.length;e+=nums[i-1]!=nums[i++]?1:0,cnt+=e);
        return cnt;
    }
}
