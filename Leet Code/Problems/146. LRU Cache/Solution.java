class LRUCache extends LinkedHashMap<Integer,Integer>
{
    int lru_capacity;
    public LRUCache(int capacity)
    {
        super(16,0.75f,true);
        lru_capacity=capacity;
    }
    
    public int get(int key)
    {
        return super.getOrDefault(key,-1);
    }
    
    public void put(int key, int value)
    {
        super.put(key,value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer,Integer> ent)
    {
        return size()>lru_capacity;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
