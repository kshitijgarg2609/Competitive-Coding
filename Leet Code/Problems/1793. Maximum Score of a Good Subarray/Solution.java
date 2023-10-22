class Solution
{
    public int maximumScore(int[] nums, int k)
    {
        int score=nums[k];
        for(int i=k,j=k,min=nums[k];i!=0 || j!=nums.length-1;min=Integer.min(min,(i>0 && (j==nums.length-1 || nums[i-1]>nums[j+1]))?nums[--i]:nums[++j]),score=Integer.max(score,min*(j-i+1)));
        return score;
    }
}
