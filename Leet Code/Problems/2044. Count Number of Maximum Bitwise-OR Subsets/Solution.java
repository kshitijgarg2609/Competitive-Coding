class Solution
{
    public int countMaxOrSubsets(int[] nums)
    {
        int max=0,cnt=0;
        for(int num : nums)
        {
            max|=num;
        }
        for(int i=1;i<((int)(Math.pow(2,nums.length)));i++)
        {
            int or=0;
            for(int j=i,k=nums.length-1;j>0;j/=2,k--)
            {
                if(j%2==1)
                {
                    or|=nums[k];
                }
            }
            if(or==max)
            {
                cnt++;
            }
        }
        return cnt;
    }
}
