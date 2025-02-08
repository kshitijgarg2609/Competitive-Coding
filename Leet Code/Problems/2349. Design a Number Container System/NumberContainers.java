class NumberContainers
{
    Map<Integer,Integer> indxMap;
    Map<Integer,Set<Integer>> numMap;
    public NumberContainers()
    {
        indxMap = new HashMap<>();
        numMap = new HashMap<>();
    }
    
    public void change(int index, int number)
    {
        if(indxMap.containsKey(index))
        {
            int prevNum = indxMap.get(index);
            Set<Integer> set = numMap.remove(prevNum);
            set.remove(index);
            if(set.size()>0)
            {
                numMap.put(prevNum,set);
            }
        }
        indxMap.put(index,number);
        numMap.computeIfAbsent(number,k->new TreeSet<>()).add(index);
    }
    public int find(int number)
    {
        if(numMap.containsKey(number))
        {
            return numMap.get(number).iterator().next();
        }
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
