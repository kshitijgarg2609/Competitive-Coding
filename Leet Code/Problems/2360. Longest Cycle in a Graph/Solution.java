class Solution
{
    public int longestCycle(int[] edges)
    {
        int max_cycle=-1;
        boolean vis[] = new boolean[edges.length];
        for(int i=0;i<edges.length;i++)
        {
            if(vis[i])
            {
                continue;
            }
            Stack<Integer> stack = new Stack<>();
            int indx=i;
            while(indx!=-1 && !vis[indx])
            {
                vis[indx]=true;
                stack.push(indx);
                indx=edges[indx];
            }
            if(indx==-1)
            {
                continue;
            }
            int cnt=0;
            while(!stack.empty())
            {
                cnt++;
                if(stack.pop()==indx)
                {
                    max_cycle=Integer.max(max_cycle,cnt);
                    break;
                }
            }
        }
        return max_cycle;
    }
}
