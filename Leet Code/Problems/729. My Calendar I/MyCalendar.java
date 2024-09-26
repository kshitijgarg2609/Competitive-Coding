class MyCalendar
{
    NavigableMap<Integer,Integer> tree;
    public MyCalendar()
    {
        tree=new TreeMap<>();
    }
    public boolean book(int start, int end)
    {
        Map.Entry<Integer,Integer> f=tree.floorEntry(start);
        Map.Entry<Integer,Integer> c=tree.ceilingEntry(start);
        if((f!=null && f.getValue()>start) || (c!=null && c.getKey()<end))
        {
            return false;
        }
        tree.put(start,end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
