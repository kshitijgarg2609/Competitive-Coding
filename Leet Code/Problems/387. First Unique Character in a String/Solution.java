class Solution
{
    public int firstUniqChar(String s)
    {
        boolean repeat[] = new boolean[26];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            int ch=s.charAt(i)-'a';
            if(!repeat[ch])
            {
                if(map.containsKey(ch))
                {
                    map.remove(ch);
                    repeat[ch]=true;
                }
                else
                {
                    map.put(ch,i);
                }
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int x : map.values())
        {
            ans=Integer.min(ans,x);
        }
        return (ans==Integer.MAX_VALUE)?-1:ans;
    }
}
