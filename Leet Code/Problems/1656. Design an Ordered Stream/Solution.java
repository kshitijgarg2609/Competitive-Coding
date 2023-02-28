class OrderedStream
{
    private String empty=null;
    private int ptr=0;
    private List<String> list;
    public OrderedStream(int n)
    {
        list=new ArrayList<>(Collections.nCopies(n,empty));
    }
    
    public List<String> insert(int idKey, String value)
    {
        list.set(idKey-1,value);
        int i=ptr;
        int j=ptr;
        while(j<list.size() && list.get(j)!=null)
        {
            j++;
        }
        ptr=j;
        return list.subList(i,j);
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
