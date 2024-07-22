class Solution
{
    public String[] sortPeople(String[] names, int[] heights)
    {
        Map<Integer,String> map = new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<names.length;i++)
        {
            map.put(heights[i],names[i]);
        }
        return map.entrySet().stream().map(Map.Entry::getValue).toArray(String[]::new);
    }
}
