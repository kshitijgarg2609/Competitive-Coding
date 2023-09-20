class Solution
{
    public int minOperations(int[] nums, int x)
    {
        int target=Arrays.stream(nums).sum()-x;
        if(target<=0)
        {
            return (target==0)?nums.length:-1;
        }
        int op=Integer.MAX_VALUE;
        for(int i=0,j=-1,cnt=0;i<nums.length;i++)
        {
            for(cnt+=nums[i];j<i && cnt>target;cnt-=nums[++j]);
            if(cnt==target)
            {
                op=Integer.min(op,nums.length-(i-j));
            }
        }
        return (op==Integer.MAX_VALUE)?-1:op;
    }
}
