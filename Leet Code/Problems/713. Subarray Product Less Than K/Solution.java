class Solution
{
    public int numSubarrayProductLessThanK(int[] nums, int k)
    {
        if(k<=1)
        {
            return 0;
        }
        int cnt=0;
        for(int i=0,j=0,p=1;i<nums.length;i++)
        {
            p*=nums[i];
            for(;p>=k;p/=nums[j++]);
            cnt+=i-j+1;
        }
        return cnt;
    }
}
