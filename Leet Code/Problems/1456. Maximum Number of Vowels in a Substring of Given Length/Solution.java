class Solution
{
    public int maxVowels(String s, int k)
    {
        Map<Character,Integer> map = new HashMap<>(){{put('a',0);put('e',0);put('i',0);put('o',0);put('u',0);}};
        Queue<Character> qu = new LinkedList<>();
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            qu.add(c);
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            if(i>=k-1)
            {
                max=Integer.max(max,map.values().stream().mapToInt(Integer::intValue).sum());
                char d=qu.remove();
                if(map.containsKey(d))
                {
                    map.put(d,map.get(d)-1);
                }
            }
        }
        return max;
    }
}
