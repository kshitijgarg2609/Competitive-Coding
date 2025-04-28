class Solution
{
    public long countSubarrays(int[] nums, long k)
    {
        long res=0,total=0;
        for(int i=0,j=0;i<nums.length;i++)
        {
            for(total+=nums[i];j<=i && total*(i-j+1)>=k;total-=nums[j++]);
            res+=1L+i-j;
        }
        return res;
    }
}
