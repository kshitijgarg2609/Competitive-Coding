class Solution
{
    public int minimumPushes(String word)
    {
        int cnt[] = new int[26];
        word.chars().forEach(c->cnt[c-'a']++);
        Arrays.sort(cnt);
        return IntStream.range(0,26).map(i->((i/8)+1)*cnt[26-i-1]).sum();
    }
}
