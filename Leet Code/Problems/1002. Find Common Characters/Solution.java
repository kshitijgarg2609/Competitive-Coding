class Solution
{
    public List<String> commonChars(String[] words)
    {
        Map<Integer,Long> map = words[0].chars().boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for(int i=1;i<words.length;i++)
        {
            Map<Integer,Long> map_match = words[i].chars().boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
            Iterator<Map.Entry<Integer,Long>> it = map.entrySet().iterator();
            while(it.hasNext())
            {
                Map.Entry<Integer,Long> ent=it.next();
                if(map_match.containsKey(ent.getKey()))
                {
                    ent.setValue(Long.min(ent.getValue(),map_match.get(ent.getKey())));
                }
                else
                {
                    it.remove();
                }
            }
        }
        List<String> li = new ArrayList<>();
        for(Map.Entry<Integer,Long> ob : map.entrySet())
        {
            li.addAll(Collections.nCopies(ob.getValue().intValue(),String.valueOf((char)ob.getKey().intValue())));
        }
        return li;
    }
}
