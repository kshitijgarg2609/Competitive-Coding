class Solution
{
    public int minBitFlips(int start, int goal)
    {
        return (int)(Integer.toBinaryString(start^goal).chars().filter(num->num=='1').count());
    }
}
