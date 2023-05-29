class Solution
{
    public void nextPermutation(int[] nums)
    {
        int i,j,k;
        for(i=nums.length-2;i>=0 && nums[i]>=nums[i+1];i--);
        if(i>=0)
        {
            for(j=nums.length-1;j>=0 && nums[j]<=nums[i];j--);
            k=nums[i];
            nums[i]=nums[j];
            nums[j]=k;
        }
        for(i++,j=nums.length-1;i<j;k=nums[i],nums[i]=nums[j],nums[j]=k,i++,j--);
    }
}
