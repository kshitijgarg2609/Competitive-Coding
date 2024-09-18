class Solution
{
    public String largestNumber(int[] nums)
    {
        String num=Arrays.stream(nums).boxed().sorted((a,b)->String.format("%d%d",b,a).compareTo(String.format("%d%d",a,b))).map(String::valueOf).reduce("",(a,b)->a+b);
        return (num.charAt(0)=='0')?"0":num;
    }
}
