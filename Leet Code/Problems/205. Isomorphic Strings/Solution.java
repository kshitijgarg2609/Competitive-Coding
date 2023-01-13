class Solution
{
    public boolean isIsomorphic(String s, String t)
    {
        Map<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            char d=t.charAt(i);
            boolean key_check=map.containsKey(c);
            if((key_check && map.get(c)!=d)||(!key_check && map.containsValue(d)))
            {
                return false;
            }
            map.put(c,d);
        }
        return true;
    }
}
