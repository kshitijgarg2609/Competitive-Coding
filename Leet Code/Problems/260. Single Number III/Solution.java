class Solution
{
    public int[] singleNumber(int[] nums)
    {
        int xor=0;
        for(int num : nums)
        {
            xor^=num;
        }
        xor=Integer.lowestOneBit(xor);
        int ans[] = new int[]{0,0};
        for(int num : nums)
        {
            ans[(((num&xor)==0)?0:1)]^=num;
        }
        return ans;
    }
}
