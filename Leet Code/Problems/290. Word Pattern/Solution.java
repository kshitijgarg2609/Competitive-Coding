class Solution
{
    public boolean wordPattern(String pattern, String s)
    {
        String words[] = s.split(" ");
        if(pattern.length()!=words.length)
        {
            return false;
        }
        Map<Character,String> map = new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            String value=map.get(pattern.charAt(i));
            boolean value_flag=map.containsValue(words[i]);
            if((value!=null && !words[i].equals(value))
            || (value==null && value_flag))
            {
                return false;
            }
            map.put(pattern.charAt(i),words[i]);
        }
        return true;
    }
}
