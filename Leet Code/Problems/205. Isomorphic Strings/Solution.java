class Solution
{
    public boolean isIsomorphic(String s, String t)
    {
        Map<Character,Character> map1 = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!map1.containsKey(s.charAt(i)))
            {
                map1.put(s.charAt(i),t.charAt(i));
            }
            if(!map2.containsKey(t.charAt(i)))
            {
                map2.put(t.charAt(i),s.charAt(i));
            }
            if(map1.get(s.charAt(i)).charValue()!=t.charAt(i) || map2.get(t.charAt(i)).charValue()!=s.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
}
