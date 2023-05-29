class Solution
{
    public boolean hasAlternatingBits(int n)
    {
        char bits[] = Integer.toBinaryString(n).toCharArray();
        for(int i=0;i<bits.length;i++)
        {
            if((i%2==0 && bits[i]=='0') || (i%2==1 && bits[i]=='1'))
            {
                return false;
            }
        }
        return true;
    }
}
