class Solution
{
    public boolean canCross(int[] stones)
    {
        boolean vis[][] = new boolean[stones.length][stones.length];
        Queue<Integer> jmp = new LinkedList<>(){{add(0);}};
        Queue<Integer> indx = new LinkedList<>(){{add(0);}};
        int jmp_x[] = new int[]{-1,0,1};
        dp[0][0]=true;
        while(!indx.isEmpty())
        {
            int pop_jmp=jmp.remove();
            int pop_indx=indx.remove();
            if(pop_indx==stones.length-1)
            {
                return true;
            }
            for(int j : jmp_x)
            {
                int nxt_jmp=pop_jmp+j;
                int nxt_indx=Arrays.binarySearch(stones,stones[pop_indx]+nxt_jmp);
                if(nxt_indx>0 && nxt_jmp>0 && !vis[nxt_indx][nxt_jmp])
                {
                    indx.add(nxt_indx);
                    jmp.add(nxt_jmp);
                    vis[nxt_indx][nxt_jmp]=true;
                }
            }
        }
        return false;
    }
}
