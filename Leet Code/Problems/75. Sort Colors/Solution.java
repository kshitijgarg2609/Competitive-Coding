class Solution
{
    public void sortColors(int[] nums)
    {
        int color[] = new int[3];
        for(int i=0;i<nums.length;color[nums[i++]]++);
        for(int i=0,j=0;j<color.length;j++)
        {
            for(;color[j]>0;nums[i++]=j,color[j]--);
        }
    }
}
