class Solution
{
    public String sortVowels(String s)
    {
        Map<Character,Integer> map = new TreeMap<>();
        Arrays.asList('A','E','I','O','U','a','e','i','o','u').stream().forEach(ch->map.put(ch,0));
        for(int i=0;i<s.length();map.computeIfPresent(s.charAt(i++),(k,v)->v+1));
        char arr[] = s.toCharArray();
        int i=0;
        for(Map.Entry<Character,Integer> ent : map.entrySet())
        {
            for(int cnt=ent.getValue();cnt>0;i++)
            {
                if(map.containsKey(arr[i]))
                {
                    arr[i]=ent.getKey();
                    cnt--;
                }
            }
        }
        return new String(arr);
    }
}
