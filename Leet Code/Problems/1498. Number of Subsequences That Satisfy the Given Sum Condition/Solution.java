class Solution
{
    public int numSubseq(int[] nums, int target)
    {
        int mod=(int)(1E9+7);
        int mul[] = new int[nums.length];
        mul[0]=1;
        for(int i=1;i<mul.length;i++)
        {
            mul[i]=(2*mul[i-1])%mod;
        }
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int cnt=0;
        while(left<=right)
        {
            if((nums[left]+nums[right])<=target)
            {
                cnt=(int)((0L+cnt+mul[right-left++])%mod);
            }
            else
            {
                right--;
            }
        }
        return cnt;
    }
}
