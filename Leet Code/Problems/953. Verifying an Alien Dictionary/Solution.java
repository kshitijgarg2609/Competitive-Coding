class Solution
{
    public boolean isAlienSorted(String[] words, String order)
    {
        Map<Character,Integer> map = new HashMap<>();
        IntStream.range(0,order.length()).forEach(i->map.put(order.charAt(i),i));
        map.put('∅',-1);
        boolean flg=false;
        for(int i=1;i<words.length;i++)
        {
            for(int j=0;j<Integer.max(words[i-1].length(),words[i].length());j++)
            {
                int p=map.get(j<words[i-1].length()?words[i-1].charAt(j):'∅');
                int q=map.get(j<words[i].length()?words[i].charAt(j):'∅');
                if(p>q)
                {
                    return false;
                }
                else if(p<q)
                {
                    break;
                }
            }
        }
        return true;
    }
}
