class Solution
{
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2)
    {
        List<Integer> list1 = Arrays.stream(nums1).distinct().sorted().boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).distinct().sorted().boxed().collect(Collectors.toList());
        int i=0;
        int j=0;
        while(i<list1.size() && j<list2.size())
        {
            if(list1.get(i)<list2.get(j))
            {
                i++;
            }
            else if(list1.get(i)>list2.get(j))
            {
                j++;
            }
            else
            {
                list1.remove(i);
                list2.remove(j);
            }
        }
        return new ArrayList<>(){{add(list1);add(list2);}};
    }
}
