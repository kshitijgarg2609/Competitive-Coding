class MyHashSet
{
    List<List<Integer>> bucket;
    public MyHashSet()
    {
        int size=10000;
        bucket=new ArrayList(size);
        IntStream.range(0,size).forEach(x->bucket.add(new ArrayList<>()));
    }
    
    public void add(int key)
    {
        int hash=key%bucket.size();
        if(!contains(key))
        {
            bucket.get(hash).add(key);
        }
    }
    
    public void remove(int key)
    {
        int hash=key%bucket.size();
        if(contains(key))
        {
            bucket.get(hash).remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key)
    {
        int hash=key%bucket.size();
        return bucket.get(hash).contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
