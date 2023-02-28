class Solution
{
    public int countConsistentStrings(String allowed, String[] words)
    {
        Set<Integer> allow_set = allowed.chars().boxed().collect(Collectors.toSet());
        int cnt=0;
        for(String w : words)
        {
            cnt=(allow_set.containsAll(w.chars().boxed().collect(Collectors.toSet())))?(cnt+1):cnt;
        }
        return cnt;
    }
}
