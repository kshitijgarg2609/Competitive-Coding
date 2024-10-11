class Solution
{
    public int smallestChair(int[][] times, int targetFriend)
    {
        int chair=-1,newChair=0;
        List<int[]> logs = new LinkedList<>();
        for(int i=0;i<times.length;i++)
        {
            logs.add(new int[]{times[i][0],i,1});
            logs.add(new int[]{times[i][1],i,-1});
        }
        Collections.sort(logs,(a,b)->a[0]==b[0]?Integer.compare(a[2],b[2]):Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> unoccupied = new PriorityQueue<>();
        Map<Integer,Integer> occupied = new HashMap<>();
        for(int log[] : logs)
        {
            if(log[2]==1)
            {
                occupied.put(log[1],(unoccupied.isEmpty())?newChair++:unoccupied.remove());
            }
            else if(log[2]==-1)
            {
                unoccupied.add((chair=occupied.remove(log[1])));
                if(log[1]==targetFriend)
                {
                    break;
                }
            }
        }
        return chair;
    }
}
