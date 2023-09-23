class Solution
{
    public int longestStrChain(String[] words)
    {
        Arrays.sort(words,Comparator.comparingInt(String::length));
        Map<String,Integer> map = new HashMap<>();
        int max=0;
        for(String word : words)
        {
            int cnt=1;
            StringBuilder sb = new StringBuilder(word);
            for(int i=0;i<word.length();i++)
            {
                sb.deleteCharAt(i);
                cnt=Integer.max(cnt,map.getOrDefault(sb.toString(),0)+1);
                sb.insert(i,word.charAt(i));
            }
            max=Integer.max(max,cnt);
            map.put(word,cnt);
        }
        return max;
    }
}
