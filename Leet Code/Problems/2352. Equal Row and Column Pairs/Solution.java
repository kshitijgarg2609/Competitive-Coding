class Solution
{
    class Trie extends HashMap<Integer,Trie>
    {
        int count=0;
        void add(int arr[])
        {
            Trie t=this;
            for(int i : arr)
            {
                t.putIfAbsent(i,new Trie());
                t=t.get(i);
                t.count++;
            }
        }
        Trie searchElement(int i)
        {
            return getOrDefault(i,null);
        }
    }
    public int equalPairs(int[][] grid)
    {
        int n=grid.length;
        Trie tr = new Trie();
        for(int arr[] : grid)
        {
            tr.add(arr);
        }
        int ans=0;
        outer:
        for(int c=0;c<n;c++)
        {
            Trie ptr=tr;
            for(int r=0;r<n;r++)
            {
                ptr=ptr.searchElement(grid[r][c]);
                if(ptr==null)
                {
                    continue outer;
                }
            }
            ans+=ptr.count;
        }
        return ans;
    }
}
