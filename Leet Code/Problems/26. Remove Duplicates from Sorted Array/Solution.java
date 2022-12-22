class Solution
{
    public int removeDuplicates(int[] nums)
    {
        int l=nums.length;
        if(l==1)
        {
            return 1;
        }
        int k=l;
        for(int prev=0,next=1;next<l;next++)
        {
            if(nums[next]==nums[next-1])
            {
                k--;
                continue;
            }
            nums[++prev]=nums[next];
        }
        return k;
    }
}
