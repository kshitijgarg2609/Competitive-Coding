class Solution
{
    public int maxLengthBetweenEqualCharacters(String s)
    {
        Map<Character,Integer> map = new HashMap<>();
        int max=-1;
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                max=Integer.max(max,i-map.get(s.charAt(i))-1);
            }
            else
            {
                map.put(s.charAt(i),i);
            }
        }
        return max;
    }
}
