class Solution
{
    public int minDeletions(String s)
    {
        int arr[] = new int[26];
        for(char c : s.toCharArray())
        {
            arr[c-'a']++;
        }
        Set<Integer> set = new HashSet<>();
        int del=0;
        for(int f : arr)
        {
            for(;f>0 && set.contains(f);del++,f--);
            set.add(f);
        }
        return del;
    }
}
