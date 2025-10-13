class Solution
{
    public List<String> removeAnagrams(String[] words)
    {
        List<String> list = new LinkedList<>();
        for(int i=0;i<words.length;)
        {
            for(list.add(words[i++]);i<words.length && Arrays.equals(list.getLast().chars().sorted().toArray(),words[i].chars().sorted().toArray());i++);
        }
        return list;
    }
}
