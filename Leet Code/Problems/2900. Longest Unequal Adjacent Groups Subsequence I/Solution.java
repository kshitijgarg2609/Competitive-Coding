class Solution
{
    public List<String> getLongestSubsequence(String[] words, int[] groups)
    {
        List<String> list = new LinkedList<>();
        for(int i=0;i<words.length;)
        {
            int indx=i++;
            list.add(words[indx]);
            for(;i<words.length && groups[indx]==groups[i];i++);
        }
        return list;
    }
}
