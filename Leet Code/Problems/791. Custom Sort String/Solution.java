class Solution
{
    public String customSortString(String order, String s)
    {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<order.length();map.put(order.charAt(i++),0));
        StringBuilder sb = new StringBuilder(s);
        for(int i=sb.length()-1;i>=0;i--)
        {
            if(map.containsKey(sb.charAt(i)))
            {
                map.put(sb.charAt(i),map.get(sb.charAt(i))+1);
                sb.deleteCharAt(i);
            }
        }
        for(int i=order.length()-1;i>=0;i--)
        {
            for(int j=1;j<=map.get(order.charAt(i));j++)
            {
                sb.insert(0,order.charAt(i));
            }
        }
        return sb.toString();
    }
}
