class Solution
{
    public String[] spellchecker(String[] wordlist, String[] queries)
    {
        Set<String> set = new HashSet<>();
        Map<String,String> cap = new HashMap<>();
        Map<String,String> vow = new HashMap<>();
        for(String w : wordlist)
        {
            set.add(w);
            cap.putIfAbsent(w.toLowerCase(),w);
            vow.putIfAbsent(w.toLowerCase().replaceAll("[aeiou]","*"),w);
        }
        return Arrays.stream(queries).map(w->set.contains(w)?w:cap.getOrDefault(w.toLowerCase(),vow.getOrDefault(w.toLowerCase().replaceAll("[aeiou]","*"),""))).toArray(String[]::new);
    }
}
