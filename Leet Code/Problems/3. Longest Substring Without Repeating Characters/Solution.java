class Solution
{
    public int lengthOfLongestSubstring(String s)
    {
        int max=0;
        Set<Character> set = new HashSet<>();
        for(int i=0,j=0;i<s.length();i++)
        {
            for(;set.contains(s.charAt(i)) && j<i;set.remove(s.charAt(j++)));
            set.add(s.charAt(i));
            max=Integer.max(max,i-j+1);
        }
        return max;
    }
}
