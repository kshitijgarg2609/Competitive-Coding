class Solution
{
    public String longestDiverseString(int a, int b, int c)
    {
        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y)->Integer.compare(y[1],x[1]));
        for(int ent[] : new int[][]{{'a',a},{'b',b},{'c',c}})
        {
            if(ent[1]>0)
            {
                pq.add(ent);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty())
        {
            int pop[] = pq.remove();
            if(sb.length()>=2 && sb.charAt(sb.length()-1)==pop[0] && sb.charAt(sb.length()-2)==pop[0])
            {
                if(pq.isEmpty())
                {
                    break;
                }
                sb.append((char)(pq.peek()[0]));
                pq.peek()[1]--;
            }
            else
            {
                sb.append((char)(pop[0]));
                pop[1]--;
            }
            pq.add(pop);
            pq.removeIf(ent->ent[1]==0);
        }
        return sb.toString();
    }
}
