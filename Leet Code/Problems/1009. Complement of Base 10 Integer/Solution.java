class Solution
{
    public int bitwiseComplement(int n)
    {
        char bits[] = Integer.toBinaryString(n).toCharArray();
        for(int i=0;i<bits.length;i++)
        {
            bits[i]=(char)(((bits[i]-'0'+1)%2)+'0');
        }
        return Integer.parseInt((new String(bits)),2);
    }
}
