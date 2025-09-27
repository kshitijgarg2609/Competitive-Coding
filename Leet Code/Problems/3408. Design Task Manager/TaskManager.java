class TaskManager
{
    private Map<Integer,List<Integer>> map;
    private TreeMap<Integer,PriorityQueue<Integer>> ptask;
    public TaskManager(List<List<Integer>> tasks)
    {
        map=new HashMap<>();
        ptask=new TreeMap<>(Collections.reverseOrder());
        tasks.stream().forEach(t->add(t.get(0),t.get(1),t.get(2)));
    } 
    public void add(int userId, int taskId, int priority)
    {
        map.put(taskId,Arrays.asList(userId,taskId,priority));
        ptask.computeIfAbsent(priority,k->new PriorityQueue<>(Collections.reverseOrder())).add(taskId);
    }
    
    public void edit(int taskId, int newPriority)
    {
        int userId = map.get(taskId).get(0);
        rmv(taskId);
        add(userId,taskId,newPriority);
    }
    
    public void rmv(int taskId)
    {
        List<Integer> tup = map.remove(taskId);
        PriorityQueue<Integer> pq = ptask.get(tup.get(2));
        pq.remove(tup.get(1));
        if(pq.isEmpty())
        {
            ptask.remove(tup.get(2));
        }
    }
    
    public int execTop()
    {
        if(!ptask.isEmpty())
        {
            int taskId = ptask.firstEntry().getValue().peek();
            int userId = map.get(taskId).get(0); 
            rmv(taskId);
            return userId;
        }
        return -1;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */
