class Solution
{
    public int colorTheGrid(int m, int n)
    {
        int mod=(int)(1e9+7);
        Map<String,Set<String>> colorColumn = new HashMap<>();
        Map<String,Integer> map = new HashMap<>();
        for(int col=0;col<(int)Math.pow(3,m);col++)
        {
            StringBuilder sb = new StringBuilder(Integer.toString(col,3));
            for(;sb.length()!=m;sb.insert(0,'0'));
            if(IntStream.range(0,m-1).filter(i->sb.charAt(i)==sb.charAt(i+1)).count()==0L)
            {
                colorColumn.put(sb.toString(),new HashSet<>());
                map.put(sb.toString(),1);
            }
        }
        for(String key : colorColumn.keySet())
        {
            for(String mkey : colorColumn.keySet())
            {
                if(!key.equals(mkey) && IntStream.range(0,key.length()).filter(i->key.charAt(i)==mkey.charAt(i)).count()==0L)
                {
                    colorColumn.get(key).add(mkey);
                }
            }
        }
        for(int i=1;i<n;i++)
        {
            Map<String,Integer> nxt = new HashMap<>();
            for(Map.Entry<String,Integer> e : map.entrySet())
            {
                for(String adj : colorColumn.get(e.getKey()))
                {
                    nxt.put(adj,(nxt.getOrDefault(adj,0)+e.getValue())%mod);
                }
            }
            map=nxt;
        }
        return (int)(map.values().stream().mapToLong(Integer::longValue).sum()%mod);
    }
}
