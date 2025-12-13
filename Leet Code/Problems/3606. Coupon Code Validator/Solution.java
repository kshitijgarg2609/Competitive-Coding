class Solution
{
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive)
    {
        Map<String,List<String>> map = new LinkedHashMap<>();
        Stream.of("electronics", "grocery", "pharmacy", "restaurant").forEach(bL->map.put(bL,new LinkedList<>()));
        for(int i=0;i<code.length;i++)
        {
            if(code[i].matches("^[a-zA-Z0-9_]+$") && map.containsKey(businessLine[i]) && isActive[i])
            {
                map.get(businessLine[i]).add(code[i]);
            }
        }
        return map.entrySet().stream().flatMap(e->e.getValue().stream().sorted()).collect(Collectors.toList());
    }
}
