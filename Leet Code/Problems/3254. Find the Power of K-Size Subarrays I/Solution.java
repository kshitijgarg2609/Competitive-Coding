class Solution
{
    public int[] resultsArray(int[] nums, int k)
    {
        int ans[] = new int[nums.length-k+1];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=nums[i];
            for(int j=i+1;j<i+k;j++)
            {
                if(nums[j-1]>=nums[j] || nums[j]-nums[j-1]!=1)
                {
                    ans[i]=-1;
                    break;
                }
                ans[i]=Integer.max(ans[i],nums[j]);
            }
        }
        return ans;
    }
}
