class Solution
{
    public int[] sortArray(int[] nums)
    {
        if(nums.length==1)
        {
            return nums;
        }
        else if(nums.length==2)
        {
            return new int[]{Integer.min(nums[0],nums[1]),Integer.max(nums[0],nums[1])};
        }
        int mid=nums.length/2;
        int left[] = sortArray(Arrays.copyOf(nums,(mid+1)));
        int right[] = sortArray(Arrays.copyOfRange(nums,(mid+1),nums.length));
        int l=0;
        int r=0;
        int i=0;
        while(l<left.length && r<right.length)
        {
            if(left[l]<=right[r])
            {
                nums[i++]=left[l++];
            }
            else
            {
                nums[i++]=right[r++];
            }
        }
        if(l<left.length)
        {
            System.arraycopy(left,l,nums,i,left.length-l);
        }
        else if(r<right.length)
        {
            System.arraycopy(right,r,nums,i,right.length-r);
        }
        return nums;
    }
}
