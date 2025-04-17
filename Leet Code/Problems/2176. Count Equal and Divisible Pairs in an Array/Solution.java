class Solution
{
    public int countPairs(int[] nums, int k)
    {
        int cnt=0;
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.computeIfAbsent(nums[i],key->new LinkedList<>()).add(i);
        }
        for(List<Integer> list : map.values())
        {
            for(int i=0;i<list.size()-1;i++)
            {
                for(int j=i+1;j<list.size();j++)
                {
                    if((list.get(i)*list.get(j))%k==0)
                    {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
