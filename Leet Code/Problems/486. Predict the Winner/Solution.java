class Solution
{
    public boolean predictTheWinner(int[] nums)
    {
        int total=Arrays.stream(nums).sum();
        int p1=scoreP1(nums,0,nums.length-1,new Integer[nums.length][nums.length]),p2=total-p1;
        return p1>=p2;
    }
    int scoreP1(int nums[], int i, int j, Integer dp[][])
    {
        if(i>j)
        {
            return 0;
        }
        else if(dp[i][j]!=null)
        {
            return dp[i][j];
        }
        else if(i==j)
        {
            return (dp[i][j]=nums[i]);
        }
        int first=nums[i]+Integer.min(scoreP1(nums,i+2,j,dp),scoreP1(nums,i+1,j-1,dp));
        int last=nums[j]+Integer.min(scoreP1(nums,i+1,j-1,dp),scoreP1(nums,i,j-2,dp));
        return (dp[i][j]=Integer.max(first,last));
    }
}
