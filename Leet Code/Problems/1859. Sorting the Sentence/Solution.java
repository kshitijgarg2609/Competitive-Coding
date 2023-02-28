class Solution
{
    public String sortSentence(String s)
    {
        Map<Integer,String> map = new TreeMap<>();
        for(String w : s.split(" "))
        {
            StringBuilder key = new StringBuilder();
            StringBuilder value = new StringBuilder();
            for(char c : w.toCharArray())
            {
                if(Character.isDigit(c))
                {
                    key.append(c);
                }
                else
                {
                    value.append(c);
                }
            }
            map.put(Integer.valueOf(key.toString()),value.toString());
        }
        return String.join(" ",map.values());
    }
}
