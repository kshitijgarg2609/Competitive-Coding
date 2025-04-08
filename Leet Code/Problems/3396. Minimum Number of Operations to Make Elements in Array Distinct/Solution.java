class Solution
{
    public int minimumOperations(int[] nums)
    {
        int cnt=0;
        for(int i=0,l=nums.length;l>0 && Arrays.stream(nums,i,nums.length).distinct().count()!=l;i+=3,l-=3,cnt++);
        return cnt;
    }
}
