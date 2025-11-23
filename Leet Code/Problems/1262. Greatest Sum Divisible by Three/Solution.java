class Solution
{
    public int maxSumDivThree(int[] nums)
    {
        int sum=Arrays.stream(nums).sum();
        int mod1[] = Arrays.stream(nums).filter(n->n%3==1).sorted().limit(2L).toArray();
        int mod2[] = Arrays.stream(nums).filter(n->n%3==2).sorted().limit(2L).toArray();
        if(sum%3==1)
        {
            sum-=Integer.min((mod1.length>=1)?mod1[0]:Integer.MAX_VALUE,(mod2.length>=2)?(mod2[0]+mod2[1]):Integer.MAX_VALUE);
        }
        else if(sum%3==2)
        {
            sum-=Integer.min((mod2.length>=1)?mod2[0]:Integer.MAX_VALUE,(mod1.length>=2)?(mod1[0]+mod1[1]):Integer.MAX_VALUE);
        }
        return sum;
    }
}
