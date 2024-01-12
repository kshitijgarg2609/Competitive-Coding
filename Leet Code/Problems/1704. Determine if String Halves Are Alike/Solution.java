class Solution
{
    public boolean halvesAreAlike(String s)
    {
        Set<Integer> set = "aeiouAEIOU".chars().boxed().collect(Collectors.toSet());
        return s.substring(0,s.length()/2).chars().filter(set::contains).count()==s.substring(s.length()/2).chars().filter(set::contains).count();
    }
}
