class Solution
{
    public int[] sortArrayByParityII(int[] nums)
    {
        int odd=0;
        int even=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0 && nums[i]%2==1)
            {
                for(even=(even<=i)?i+1:even;even<nums.length && nums[even]%2==1;even++);
                int tmp=nums[i];
                nums[i]=nums[even];
                nums[even]=tmp;
            }
            else if(i%2==1 && nums[i]%2==0)
            {
                for(odd=(odd<=i)?i+1:odd;odd<nums.length && nums[odd]%2==0;odd++);
                int tmp=nums[i];
                nums[i]=nums[odd];
                nums[odd]=tmp;
            }
        }
        return nums;
    }
}
