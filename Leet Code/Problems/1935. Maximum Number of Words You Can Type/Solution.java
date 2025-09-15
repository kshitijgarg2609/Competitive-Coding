class Solution
{
    public int canBeTypedWords(String text, String brokenLetters)
    {
        Set<Integer> set = brokenLetters.chars().boxed().collect(Collectors.toSet());
        return (int)Arrays.stream(text.split(" ")).filter(w->!w.chars().anyMatch(c->set.contains(c))).count();
    }
}
