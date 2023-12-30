class Solution
{
    public boolean makeEqual(String[] words)
    {
        for(long v : Arrays.stream(words).flatMapToInt(word->word.chars()).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).values())
        {
            if(v%words.length!=0)
            {
                return false;
            }
        }
        return true;
    }
}
