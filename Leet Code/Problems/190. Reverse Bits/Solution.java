public class Solution
{
    // you need treat n as an unsigned value
    public int reverseBits(int n)
    {
        char bits[] = new char[32];
        Arrays.fill(bits,'0');
        int i=0;
        long val=Integer.toUnsignedLong(n);
        while(val>0)
        {
            bits[i++]=(char)((val%2)+'0');
            val/=2;
        }
        return Long.valueOf((new String(bits)),2).intValue();
    }
}
