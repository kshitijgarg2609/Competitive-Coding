class Solution
{
    public int removeElement(int[] nums, int val)
    {
        if(nums.length==1)
        {
            return (nums[0]==val)?0:1;
        }
        int k=nums.length;
        for(int prev=0,next=0;next<nums.length;next++)
        {
            if(nums[next]==val)
            {
                k--;
                continue;
            }
            nums[prev++]=nums[next];
        }
        return k;
    }
}
