class Solution
{
    public List<Integer> findWordsContaining(String[] words, char x)
    {
        return IntStream.range(0,words.length).filter(i->words[i].indexOf(x)>=0).mapToObj(Integer::valueOf).toList();
    }
}
