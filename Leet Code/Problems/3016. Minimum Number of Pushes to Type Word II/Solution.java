class Solution
{
    public int minimumPushes(String word)
    {
        int cnt=0,key=2,press=1;
        Map<Character,Integer> map = new HashMap<>();
        for(char c : word.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        Map<Integer,Integer> freq = new TreeMap<>(Collections.reverseOrder());
        for(int f : map.values())
        {
            freq.put(f,freq.getOrDefault(f,0)+1);
        }
        for(Map.Entry<Integer,Integer> ent : freq.entrySet())
        {
            for(int i=0;i<ent.getValue();i++)
            {
                cnt+=(ent.getKey()*press);
                if(key++==9)
                {
                    key=2;
                    press++;
                }
            }
        }
        return cnt;
    }
}
