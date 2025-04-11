class Solution
{
    public int countSymmetricIntegers(int low, int high)
    {
        int cnt=0;
        for(int n=low;n<=high;n++)
        {
            String num = Integer.toString(n);
            if(num.length()%2==1)
            {
                continue;
            }
            if(IntStream.range(0,num.length()/2).map(i->num.charAt(i)-'0').sum()==IntStream.range(num.length()/2,num.length()).map(i->num.charAt(i)-'0').sum())
            {
                cnt++;
            }
        }
        return cnt;
    }
}
