class Solution
{
    public int rotatedDigits(int n)
    {
        return (int)IntStream.rangeClosed(1,n).filter(num->
        {
            boolean d[] = new boolean[10];
            for(;num>0;d[num%10]=true,num/=10);
            return !d[3] && !d[4] && !d[7] && (d[2] || d[5] || d[6] || d[9]);
        }).count();
    }
}
