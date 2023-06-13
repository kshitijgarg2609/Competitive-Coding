class MyHashMap
{
    List<List<List<Integer>>> hash_table;
    int buckets=10;
    public MyHashMap()
    {
        hash_table=new ArrayList<>();
        IntStream.range(0,buckets).forEach(x->hash_table.add(new ArrayList<>()));
    }
    
    public void put(int key, int value)
    {
        int hkey=key%buckets;
        int indx=Collections.binarySearch(hash_table.get(hkey),Arrays.asList(key,0),(a,b)->Integer.compare(a.get(0),b.get(0)));
        if(indx>=0)
        {
            hash_table.get(hkey).set(indx,Arrays.asList(key,value));
        }
        else
        {
            hash_table.get(hkey).add(Math.abs(indx)-1,Arrays.asList(key,value));
        }
    }
    
    public int get(int key)
    {
        int hkey=key%buckets;
        int indx=Collections.binarySearch(hash_table.get(hkey),Arrays.asList(key,0),(a,b)->Integer.compare(a.get(0),b.get(0)));
        return (indx<0)?-1:hash_table.get(hkey).get(indx).get(1);
    }
    
    public void remove(int key)
    {
        int hkey=key%buckets;
        int indx=Collections.binarySearch(hash_table.get(hkey),Arrays.asList(key,0),(a,b)->Integer.compare(a.get(0),b.get(0)));
        if(indx>=0)
        {
            hash_table.get(hkey).remove(indx);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
