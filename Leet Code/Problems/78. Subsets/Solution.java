class Solution
{
    public List<List<Integer>> subsets(int[] nums)
    {
        List<List<Integer>> list = new LinkedList<>();
        for(int i=0;i<(1<<nums.length);i++)
        {
            String bin = Integer.toBinaryString(i);
            System.out.println(bin);
            List<Integer> set = new LinkedList<>();
            for(int b=bin.length()-1,j=nums.length-1;b>=0;b--,j--)
            {
                if(bin.charAt(b)=='1')
                {
                    set.add(nums[j]);
                }
            }
            list.add(set);
        }
        return list;
    }
}
