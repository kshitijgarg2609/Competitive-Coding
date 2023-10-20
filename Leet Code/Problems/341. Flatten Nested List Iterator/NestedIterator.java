/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer>
{

    private Deque<NestedInteger> qu;
    public NestedIterator(List<NestedInteger> nestedList)
    {
        qu = new LinkedList<>();
        nestedList.stream().forEach(x->qu.add(x));
    }

    @Override
    public Integer next()
    {
        if(hasNext())
        {
            return qu.removeFirst().getInteger();
        }
        return null;
    }

    @Override
    public boolean hasNext()
    {
        while(!qu.isEmpty() && !qu.peekFirst().isInteger())
        {
            List<NestedInteger> list=qu.removeFirst().getList();
            IntStream.range(0,list.size()).forEach(x->qu.addFirst(list.get(list.size()-x-1)));
        }
        return !qu.isEmpty();
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
