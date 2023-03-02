class Solution
{
    public String toHex(int num)
    {
        StringBuilder sb = new StringBuilder();
        long n=num;
        if(n==0)
        {
            return "0";
        }
        else if(n<0)
        {
            n+=(2L*(Integer.MAX_VALUE+1L));
        }
        while(n>0)
        {
            int mod=(int)(n%16);
            sb.append((char)((mod<10)?(mod+'0'):(mod-10+'a')));
            n/=16;
        }
        return sb.reverse().toString();
    }
}
