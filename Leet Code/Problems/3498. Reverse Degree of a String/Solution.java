class Solution
{
    static final Map<Character,Integer> map = new HashMap<>();
    static
    {
        for(int c='a',val=26;c<='z';map.put((char)c++,val--));
    }
    public int reverseDegree(String s)
    {
        return IntStream.range(0,s.length()).map(i->(i+1)*map.get(s.charAt(i))).sum();
    }
}
