class Solution
{
    public String sortString(String s)
    {
        Map<Integer,Long> map = new TreeMap<>(s.chars().boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
        StringBuilder sb = new StringBuilder();
        int last_length=0;
        boolean rev=false;
        while(map.size()>0)
        {
            Iterator<Map.Entry<Integer,Long>> it = map.entrySet().iterator();
            while(it.hasNext())
            {
                Map.Entry<Integer,Long> ent = it.next();
                if(!rev)
                {
                    sb.append((char)(ent.getKey().intValue()));
                }
                else
                {
                    sb.insert(last_length,(char)(ent.getKey().intValue()));
                }
                ent.setValue(ent.getValue()-1);
                if(ent.getValue()==0)
                {
                    it.remove();
                }
            }
            rev=!rev;
            last_length=sb.length();
        }
        return sb.toString();
    }
}
