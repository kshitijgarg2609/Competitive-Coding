class Solution
{
    class Trie extends HashMap<Character,Trie>
    {
        void store(char str[])
        {
            Trie tt = this;
            for(char c : str)
            {
                tt.putIfAbsent(c,new Trie());
                tt=tt.get(c);
            }
        }
        boolean search(char str[])
        {
            Trie tt = this;
            for(char c : str)
            {
                if(!tt.containsKey(c))
                {
                    return false;
                }
                tt=tt.get(c);
            }
            return true;
        }
    }
    public int openLock(String[] deadends, String target)
    {
        Trie d = new Trie();
        for(String deadend : deadends)
        {
            if(deadend.equals("0000"))
            {
                return -1;
            }
            d.store(deadend.toCharArray());
        }
        int ans=-1;
        Trie vis = new Trie();
        Queue<String> bfs = new LinkedList<>();
        Queue<Integer> moves = new LinkedList<>();
        bfs.add("0000");
        moves.add(0);
        vis.store("0000".toCharArray());
        while(!bfs.isEmpty())
        {
            String pop = bfs.remove();
            int mov = moves.remove();
            if(pop.equals(target))
            {
                ans=mov;
                break;
            }
            for(int i=0;i<pop.length();i++)
            {
                for(int del : new int[]{-1,1})
                {
                    char arr[] = pop.toCharArray();
                    arr[i]=(char)((arr[i]-'0'+del+10)%10+'0');
                    if(!d.search(arr) && !vis.search(arr))
                    {
                        bfs.add(new String(arr));
                        moves.add(mov+1);
                        vis.store(arr);
                    }
                }
            }
        }
        return ans;
    }
}
