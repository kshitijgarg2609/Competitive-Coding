class Solution
{
    public int[] sortJumbled(int[] mapping, int[] nums)
    {
        Map<Long,List<Integer>> map = new TreeMap<>();
        for(int num : nums)
        {
            char arr[] = Integer.toString(num).toCharArray();
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=(char)(mapping[arr[i]-'0']+'0');
            }
            Long key = Long.valueOf(new String(arr));
            map.computeIfAbsent(key,k->new ArrayList<>()).add(num);
        }
        return map.entrySet().stream().flatMap(ent->ent.getValue().stream()).mapToInt(Integer::intValue).toArray();
    }
}
