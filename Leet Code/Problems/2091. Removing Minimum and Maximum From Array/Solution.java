class Solution
{
    public int minimumDeletions(int[] nums)
    {
        int n=nums.length;
        int min=IntStream.range(0,n).reduce((i,j)->nums[i]<nums[j]?i:j).getAsInt();
        int max=IntStream.range(0,n).reduce((i,j)->nums[i]>nums[j]?i:j).getAsInt();
        int l=Integer.min(min,max);
        int r=Integer.max(min,max);
        return IntStream.of(r+1,n-l,n-(r-l-1)).min().getAsInt();
    }
}
