class SmallestInfiniteSet
{
    int small;
    SortedSet<Integer> set;
    public SmallestInfiniteSet()
    {
        small=1;
        set = new TreeSet<>();
    }
    
    public int popSmallest()
    {
        if(set.size()==0)
        {
            return small++;
        }
        int sm = set.first();
        set.remove(sm);
        return sm;
    }
    
    public void addBack(int num)
    {
        if(num<small)
        {
            set.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
