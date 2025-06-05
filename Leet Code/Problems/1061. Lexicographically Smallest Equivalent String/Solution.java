class Solution
{
    public String smallestEquivalentString(String s1, String s2, String baseStr)
    {
        boolean adj[][] = new boolean[26][26];
        IntStream.range(0,26).forEach(i->adj[i][i]=true);
        for(int i=0;i<s1.length();i++)
        {
            adj[s1.charAt(i)-'a'][s2.charAt(i)-'a']=adj[s2.charAt(i)-'a'][s1.charAt(i)-'a']=true;
        }
        Map<Character,Character> map = new HashMap<>();
        for(int i=0;i<26;i++)
        {
            if(map.containsKey((char)i))
            {
                continue;
            }
            Set<Character> set = new TreeSet<>();
            Queue<Integer> bfs = new LinkedList<>();
            bfs.add(i);
            set.add((char)('a'+i));
            for(;!bfs.isEmpty();bfs.remove())
            {
                IntStream.range(0,26).filter(b->adj[bfs.peek()][b] && !set.contains((char)('a'+b))).forEach(b->
                {
                    bfs.add(b);
                    set.add((char)('a' + b));
                });

            }
            set.stream().filter(c->!map.containsKey(c)).forEach(c->map.put(c,set.iterator().next()));
        }
        StringBuilder sb = new StringBuilder();
        for(char c : baseStr.toCharArray())
        {
            sb.append(map.get(c));
        }
        return sb.toString();
    }
}
