class Solution
{
    public int minOperations(int[] nums)
    {
        int one=0,g=0,min=nums.length;
        for(int n : nums)
        {
            one=one+(n==1?1:0);
            g=gcd(g,n);
        }
        if(one>0)
        {
            return nums.length-one;
        }
        if(g>1)
        {
            return -1;
        }
        for(int i=0,j;i<nums.length;i++)
        {
            for(g=0,j=i;j<nums.length;j++)
            {
                g=gcd(g,nums[j]);
                if(g==1)
                {
                    min=Integer.min(min,j-i+1);
                    break;
                }
            }
        }
        return min+nums.length-2;
    }
    int gcd(int x,int y)
    {
        for(int tmp;y!=0;tmp=y,y=x%y,x=tmp);
        return x;
    }
}
