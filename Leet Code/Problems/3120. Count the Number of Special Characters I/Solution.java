class Solution
{
    public int numberOfSpecialChars(String word)
    {
        int cnt=0;
        boolean cap[] = new boolean[26];
        boolean sml[] = new boolean[26];
        for(char c : word.toCharArray())
        {
            if(c>='A' && c<='Z')
            {
                cap[c-'A']=true;
            }
            else
            {
                sml[c-'a']=true;
            }
        }
        return (int)IntStream.range(0,26).filter(i->cap[i] && sml[i]).count();
    }
}
