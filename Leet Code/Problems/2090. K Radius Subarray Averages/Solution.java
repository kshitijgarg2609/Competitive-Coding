class Solution
{
    public int[] getAverages(int[] nums, int k)
    {
        long sum=0;
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(i-k<0 || i+k>=arr.length)
            {
                arr[i]=-1;
                sum+=nums[i];
                continue;
            }
            if(i==k)
            {
                for(int j=i;j<i+k;sum+=nums[j],j++);
            }
            sum+=nums[i+k];
            arr[i]=(int)(sum/(2*k+1));
            sum-=nums[i-k];
        }
        return arr;
    }
}
