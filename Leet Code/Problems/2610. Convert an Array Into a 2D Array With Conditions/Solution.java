class Solution
{
    public List<List<Integer>> findMatrix(int[] nums)
    {
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            int indx=map.getOrDefault(num,0);
            if(indx==list.size())
            {
                list.add(new ArrayList<>());
            }
            list.get(indx).add(num);
            map.put(num,indx+1);
        }
        return list;
    }
}
