class Solution
{
    public String frequencySort(String s)
    {
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return map.entrySet().stream().sorted((a,b)->Integer.compare(b.getValue(),a.getValue())).flatMap(ent->Stream.generate(()->ent.getKey().toString()).limit(ent.getValue())).collect(Collectors.joining());
    }
}
