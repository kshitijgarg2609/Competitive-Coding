class Solution
{
    public int findGCD(int[] nums)
    {
        int a=Arrays.stream(nums).max().getAsInt(),b=Arrays.stream(nums).min().getAsInt();
        for(int tmp;b!=0;tmp=b,b=a%b,a=tmp);
        return a;
    }
}
