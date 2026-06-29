class Solution
{
    public int numOfStrings(String[] patterns, String word)
    {
        int cnt=0;
        for(String str : patterns)
        {
            if(str.length()>word.length())
            {
                continue;
            }
            if(IntStream.range(0,word.length()).filter(i->str.charAt(0)==word.charAt(i)).filter(i->i+str.length()<=word.length()).anyMatch(i->word.substring(i,i+str.length()).equals(str)))
            {
                cnt++;
            }
        }
        return cnt;
    }
}
