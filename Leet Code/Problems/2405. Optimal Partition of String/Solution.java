class Solution
{
    public int partitionString(String s)
    {
        int cnt=1;
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray())
        {
            if(set.contains(c))
            {
                set.clear();
                set.add(c);
                cnt++;
            }
            else
            {
                set.add(c);
            }
        }
        return cnt;
    }
}
