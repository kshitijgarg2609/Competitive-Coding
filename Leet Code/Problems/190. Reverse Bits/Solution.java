class Solution
{
    public int reverseBits(int n)
    {
        int rev=0;
        for(int i=0,b=1;i<32;rev|=(((n&(1<<i))>>i)<<(32-i++-1)));
        return rev;
    }
}
