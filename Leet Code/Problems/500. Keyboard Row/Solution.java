class Solution
{
    public String[] findWords(String[] words)
    {
        List<Integer> list = new ArrayList<>(Collections.nCopies(26,(new Integer(0))));
        "qwertyuiop".chars().forEach(x->list.set(x-'a',0));
        "asdfghjkl".chars().forEach(x->list.set(x-'a',1));
        "zxcvbnm".chars().forEach(x->list.set(x-'a',2));
        return Arrays.stream(words).filter(str->
        {
            return str.chars().map(x->list.get(Character.toLowerCase(new Character((char)x))-'a')).distinct().count()==1;
        }).toArray(String[]::new);
    }
}
