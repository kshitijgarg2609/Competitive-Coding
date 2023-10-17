class Solution
{
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild)
    {
        Set<Integer> set = IntStream.concat(Arrays.stream(leftChild),Arrays.stream(rightChild)).boxed().collect(Collectors.toSet());
        Queue<Integer> bfs = new LinkedList<>();
        boolean vis[] = new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!set.contains(i))
            {
                bfs.add(i);
                vis[i]=true;
                break;
            }
        }
        while(!bfs.isEmpty())
        {
            for(int ch : new int[]{leftChild[bfs.peek()],rightChild[bfs.remove()]})
            {
                if(ch==-1)
                {
                    continue;
                }
                if(vis[ch])
                {
                    return false;
                }
                bfs.add(ch);
                vis[ch]=true;
            }
        } 
        return IntStream.range(0,n).filter(x->vis[x]).count()==n;
    }
}
