class Solution
{
    public int specialArray(int[] nums)
    {
        int ans=-1;
        Arrays.sort(nums);
        int freq[] = new int[nums.length+1];
        for(int num : nums)
        {
            freq[Integer.min(nums.length,num)]++;
        }
        for(int i=nums.length,cnt=0;i>=0;i--)
        {
            if((cnt+=freq[i])==i)
            {
                ans=i;
                break;
            }
        }
        return ans;
    }
}
