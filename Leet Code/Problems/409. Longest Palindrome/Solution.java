class Solution
{
    public int longestPalindrome(String s)
    {
        Map<Integer,Long> map = s.chars().boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        int len=0;
        boolean odd_flg=false;
        for(long x : map.values())
        {
            if(x%2==0)
            {
                len+=(int)x;
            }
            else
            {
                odd_flg=true;
                len+=(int)(x-1);
            }
        }
        return len+(odd_flg?1:0);
    }
}
