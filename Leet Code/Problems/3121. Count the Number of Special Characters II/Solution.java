class Solution
{
    public int numberOfSpecialChars(String word)
    {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0,j=word.length()-1;i<word.length();i++,j--)
        {
            char c=word.charAt(i);
            if(Character.isUpperCase(c) && !map.containsKey(c))
            {
                map.put(c,i);
            }
            c=word.charAt(j);
            if(Character.isLowerCase(c) && !map.containsKey(c))
            {
                map.put(c,j);
            }
        }
        return (int)IntStream.range(0,26).mapToObj(i->new char[]{(char)(i+'a'),(char)(i+'A')}).filter(c->map.containsKey(c[0]) && map.containsKey(c[1]) && map.get(c[0])<map.get(c[1])).count();
    }
}
