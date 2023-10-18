class Solution
{
    public int[] searchRange(int[] nums, int target)
    {
        int indx[] = new int[]{-1,-1};
        for(int i=0;i<2;i++)
        {
            for(int left=0,right=nums.length-1;left<=right;)
            {
                int mid=(left+right)/2;
                if(nums[mid]==target)
                {
                    indx[i]=mid;
                }
                if((i==0 && nums[mid]<target) || (i==1 && nums[mid]<=target))
                {
                    left=mid+1;
                }
                else
                {
                    right=mid-1;
                }
            }
        }
        return indx;
    }
}
