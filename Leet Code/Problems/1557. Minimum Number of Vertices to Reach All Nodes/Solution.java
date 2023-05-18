class Solution
{
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges)
    {
        List<Integer> list = new ArrayList<>();
        IntStream.range(0,n).forEach(i->list.add(i));
        for(List<Integer> edge : edges)
        {
            list.set(edge.get(1),edge.get(0));
        }
        IntStream.range(0,n).map(i->n-1-i).forEach(i->
        {if(list.get(i)!=i) list.remove(i);});
        return list;
    }
}
