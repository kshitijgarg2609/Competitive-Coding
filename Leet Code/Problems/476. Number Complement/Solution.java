class Solution
{
    public int findComplement(int num)
    {
        StringBuffer buffer = new StringBuffer(Integer.toBinaryString(num));
        for(int i=0;i<buffer.length();i++)
        {
            buffer.setCharAt(i,(char)((((buffer.charAt(i)-'0')+1)%2)+'0'));
        }
        return Integer.parseInt(buffer.toString(),2);
    }
}
