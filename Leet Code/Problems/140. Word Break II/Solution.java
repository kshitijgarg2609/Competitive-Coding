class Solution
{
    public List<String> wordBreak(String s, List<String> wordDict)
    {
        Set<String> set = new HashSet<>(){{addAll(wordDict);}};
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                if(set.contains(s.substring(i,j)))
                {
                    map.computeIfAbsent(i,k->new ArrayList<>()).add(j);
                }
            }
        }
        return wordBreak(0,s,map,new LinkedList<>());
    }
    public List<String> wordBreak(int i,String s,Map<Integer,List<Integer>> map,List<String> sentence)
    {
        List<String> list = new LinkedList<>();
        if(i==s.length() || !map.containsKey(i))
        {
            if(i==s.length())
            {
                list.add(String.join(" ",sentence));
            }
            return list;
        }
        for(int j : map.get(i))
        {
            sentence.add(s.substring(i,j));
            list.addAll(wordBreak(j,s,map,sentence));
            sentence.remove(sentence.size()-1);
        }
        return list;
    }
}
