class Solution
{
    public int leastInterval(char[] tasks, int n)
    {
        if(n==0)
        {
            return tasks.length;
        }
        int cnt=0;
        Map<Character,Integer> map = new HashMap<>();
        for(char task : tasks)
        {
            map.put(task,map.getOrDefault(task,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        map.values().stream().forEach(pq::add);
        while(!pq.isEmpty())
        {
            List<Integer> list = new LinkedList<>();
            for(int i=Integer.min(n+1,pq.size());i>0;i--)
            {
                list.add(pq.poll());
            }
            for(int l : list)
            {
                if(l-1>0)
                {
                    pq.add(l-1);
                }
            }
            cnt+=pq.isEmpty()?list.size():(n+1);
        }
        return cnt;
    }
}
