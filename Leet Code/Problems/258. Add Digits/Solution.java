class Solution
{
    public int addDigits(int num)
    {
        String number=String.valueOf(num);
        while(number.length()!=1)
        {
            number=String.valueOf((number.chars().sum())-(number.length()*'0'));
        }
        return Integer.valueOf(number).intValue();
    }
}
