class SnapshotArray
{
    int snp=0;
    List<TreeMap<Integer,Integer>> list;
    public SnapshotArray(int length)
    {
        list = new ArrayList<>(length);
        IntStream.range(0,length).forEach(x->list.add(new TreeMap<>(){{put(0,0);}}));
    }
    
    public void set(int index, int val)
    {
        list.get(index).put(snp,val);
    }
    
    public int snap()
    {
        return snp++;
    }
    
    public int get(int index, int snap_id)
    {
        return list.get(index).floorEntry(snap_id).getValue();
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */
