class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions)
    {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<positions.length;i++)
        {
            pq.add(new int[]{positions[i],healths[i],(directions.charAt(i)=='L'?0:1),i});
        }
        Stack<int[]> stack = new Stack<>();
        while(!pq.isEmpty())
        {
            int c[] = pq.poll();
            while(!stack.empty() && c[2]==0 && stack.peek()[2]==1 && c[1]>stack.peek()[1])
            {
                stack.pop();
                c[1]--;
            }
            if(!stack.empty() && c[2]==0 && stack.peek()[2]==1 && c[1]==stack.peek()[1])
            {
                stack.pop();
            }
            else if(!stack.empty() && c[2]==0 && stack.peek()[2]==1 && c[1]<stack.peek()[1])
            {
                stack.peek()[1]--;
            }
            else
            {
                stack.push(c);
            }
        }
        return stack.stream().sorted((a,b)->Integer.compare(a[3],b[3])).map(c->Integer.valueOf(c[1])).collect(Collectors.toList());
    }
}
