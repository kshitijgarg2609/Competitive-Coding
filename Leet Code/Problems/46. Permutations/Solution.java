class Solution
{
    public List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> list = new LinkedList<>(){{add(new LinkedList<>(Arrays.asList(nums[0])));}};
        while(list.get(0).size()!=nums.length)
        {
            List<Integer> l = list.remove(0);
            for(int i=0;i<=l.size();i++)
            {
                l.add(i,nums[l.size()]);
                list.add(new LinkedList<>(l));
                l.remove(i);
            }
        }
        return list;
    }
}
