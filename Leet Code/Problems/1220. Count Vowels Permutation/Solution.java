class Solution
{
    public int countVowelPermutation(int n)
    {
        long mod = (long)(1e9+7);
        Map<Character,Long> map = new HashMap<>();
        for(char c : Arrays.asList('a','e','i','o','u'))
        {
            map.put(c,1L);
        }
        for(int i=1;i<n;i++)
        {
            Map<Character,Long> ways = new HashMap<>();
            ways.put('a',map.get('e'));
            ways.put('e',(map.get('a')+map.get('i'))%mod);
            ways.put('i',(map.get('a')+map.get('e')+map.get('o')+map.get('u'))%mod);
            ways.put('o',(map.get('i')+map.get('u'))%mod);
            ways.put('u',map.get('a'));
            map=ways;
        }
        return (int)(map.values().stream().mapToLong(Long::longValue).sum()%mod);
    }
}
