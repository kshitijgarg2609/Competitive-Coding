class Solution
{
    public int smallestIndex(int[] nums)
    {
        int indx=-1;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int n=nums[i];n>0;sum+=n%10,n/=10);
            if(sum==i)
            {
                indx=i;
                break;
            }
        }
        return indx;
    }
}
