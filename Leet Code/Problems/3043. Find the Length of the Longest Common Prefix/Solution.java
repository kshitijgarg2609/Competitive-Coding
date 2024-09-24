class Solution
{
    class TrieStruct extends HashMap<Character,TrieStruct>
    {
        public void insert(int num)
        {
            TrieStruct ptr=this;
            for(char c : Integer.toString(num).toCharArray())
            {
                ptr.putIfAbsent(c,new TrieStruct());
                ptr=ptr.get(c);
            }
        }
        public int searchPrefixLength(int num)
        {
            int len=0;
            TrieStruct ptr=this;
            for(char c : Integer.toString(num).toCharArray())
            {
                ptr=ptr.get(c);
                if(ptr==null)
                {
                    break;
                }
                else
                {
                    len++;
                }
            }
            return len;
        }
    }
    public int longestCommonPrefix(int[] arr1, int[] arr2)
    {
        int max=0;
        TrieStruct trie = new TrieStruct();
        for(int num : arr1)
        {
            trie.insert(num);
        }
        for(int num : arr2)
        {
            max=Integer.max(max,trie.searchPrefixLength(num));
        }
        return max;
    }
}
