class Solution
{
    public int hammingDistance(int x, int y)
    {
        return (int)Integer.toBinaryString(x^y).chars().filter(value->value=='1').count();
    }
}
