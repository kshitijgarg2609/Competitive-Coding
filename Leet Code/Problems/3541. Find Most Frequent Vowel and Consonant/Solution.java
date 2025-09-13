class Solution
{
    public int maxFreqSum(String s)
    {
        int cnt[] = new int[26];
        s.chars().forEach(c->cnt[c-'a']++);
        return IntStream.range(0,26).filter(i->"aeiou".indexOf((char)(i+'a'))!=-1).map(i->cnt[i]).max().orElse(0)+IntStream.range(0,26).filter(i->"aeiou".indexOf((char)(i+'a'))==-1).map(i->cnt[i]).max().orElse(0);
    }
}
