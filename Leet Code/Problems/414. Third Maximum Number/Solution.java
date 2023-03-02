class Solution
{
    public int thirdMax(int[] nums)
    {
        SortedSet<Integer> set = new TreeSet<>();
        for(int x : nums)
        {
            set.add(x);
            if(set.size()>3)
            {
                set.remove(set.first());
            }
        }
        return (set.size()==3)?(set.first()):(set.last());
    }
}
