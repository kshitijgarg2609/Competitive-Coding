class Solution
{
    public int numOfWays(int n)
    {
        int mod=(int)(1e9+7);
        Map<String,Set<String>> colorRow = new HashMap<>();
        Map<String,Integer> map = new HashMap<>();
        for(int col=0;col<(int)Math.pow(3,3);col++)
        {
            StringBuilder sb = new StringBuilder(Integer.toString(col,3));
            for(;sb.length()!=3;sb.insert(0,'0'));
            if(IntStream.range(0,3-1).filter(i->sb.charAt(i)==sb.charAt(i+1)).count()==0L)
            {
                colorRow.put(sb.toString(),new HashSet<>());
                map.put(sb.toString(),1);
            }
        }
        for(String key : colorRow.keySet())
        {
            for(String mkey : colorRow.keySet())
            {
                if(!key.equals(mkey) && IntStream.range(0,key.length()).filter(i->key.charAt(i)==mkey.charAt(i)).count()==0L)
                {
                    colorRow.get(key).add(mkey);
                }
            }
        }
        for(int i=1;i<n;i++)
        {
            Map<String,Integer> nxt = new HashMap<>();
            for(Map.Entry<String,Integer> e : map.entrySet())
            {
                for(String adj : colorRow.get(e.getKey()))
                {
                    nxt.put(adj,(nxt.getOrDefault(adj,0)+e.getValue())%mod);
                }
            }
            map=nxt;
        }
        return (int)(map.values().stream().mapToLong(Integer::longValue).sum()%mod);
    }
}
