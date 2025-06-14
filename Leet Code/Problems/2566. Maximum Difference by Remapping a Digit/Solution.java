class Solution
{
    public int minMaxDifference(int num)
    {
        return IntStream.rangeClosed('0','9').mapToObj(c->Integer.toString(num).replace((char)c,'9')).mapToInt(str->Integer.parseInt(str)).max().getAsInt()-IntStream.rangeClosed('0','9').mapToObj(c->Integer.toString(num).replace((char)c,'0')).mapToInt(str->Integer.parseInt(str)).min().getAsInt();
    }
}
