class Solution
{
    public int maxDifference(String s)
    {
        int cnt[] = new int[26];
        IntStream.range(0,s.length()).forEach(i->cnt[s.charAt(i)-'a']++);
        return Arrays.stream(cnt).filter(n->n!=0 && n%2==1).max().getAsInt()-Arrays.stream(cnt).filter(n->n!=0 && n%2==0).min().getAsInt();
    }
}
