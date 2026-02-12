class Solution
{
    public int longestBalanced(String s)
    {
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            Map<Character,Integer> map = new HashMap<>();
            for(int j=i,match[]=new int[1];j<s.length();j++)
            {
                char c=s.charAt(j);
                map.put(c,(match[0]=map.getOrDefault(s.charAt(j),0)+1));
                if(map.values().stream().allMatch(v->v==match[0]))
                {
                    max=Integer.max(max,j-i+1);
                }
            }
        }
        return max;
    }
}
