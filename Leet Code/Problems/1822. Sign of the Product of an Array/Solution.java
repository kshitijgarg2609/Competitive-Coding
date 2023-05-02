class Solution
{
    public int arraySign(int[] nums)
    {
        int p=1;
        for(int x : nums)
        {
            p=p*((x==0)?0:((x<0)?-1:1));
        }
        return p;
    }
}
