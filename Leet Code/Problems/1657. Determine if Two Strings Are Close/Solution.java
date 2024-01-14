class Solution
{
    public boolean closeStrings(String word1, String word2)
    {
        int cnt[][] = new int[26][2];
        word1.chars().forEach(c->cnt[c-'a'][0]++);
        word2.chars().forEach(c->cnt[c-'a'][1]++);
        for(int c[] : cnt)
        {
            if(c[0]!=c[1] && (c[0]==0 || c[1]==0))
            {
                return false;
            }
        }
        return Arrays.equals(Arrays.stream(cnt).mapToInt(c->c[0]).sorted().toArray(),Arrays.stream(cnt).mapToInt(c->c[1]).sorted().toArray());
    }
}
