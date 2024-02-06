class Solution
{
    public List<List<String>> groupAnagrams(String[] strs)
    {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs)
        {
            char arr[] = str.toCharArray();
            Arrays.sort(arr);
            map.computeIfAbsent(new String(arr),k->new ArrayList<>()).add(str);
        }
        return map.values().stream().collect(Collectors.toList());
    }
}
