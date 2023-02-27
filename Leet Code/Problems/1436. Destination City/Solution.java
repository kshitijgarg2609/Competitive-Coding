class Solution
{
    public String destCity(List<List<String>> paths)
    {
        Map<String,String> map = new HashMap<>();
        for(List<String> list : paths)
        {
            map.put(list.get(0),list.get(1));
        }
        String start=map.entrySet().iterator().next().getValue();
        while(map.containsKey(start))
        {
            start=map.get(start);
        }
        return start;
    }
}
