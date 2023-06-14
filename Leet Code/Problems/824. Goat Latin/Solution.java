class Solution
{
    public String toGoatLatin(String sentence)
    {
        Set<Character> set = new HashSet<>(){{add('a');add('e');add('i');add('o');add('u');add('A');add('E');add('I');add('O');add('U');}};
        String words[] = sentence.split(" ");
        int t=1;
        for(int i=0;i<words.length;i++)
        {
            StringBuilder sb = new StringBuilder(words[i]);
            if(!set.contains(words[i].charAt(0)))
            {
                sb.deleteCharAt(0);
                sb.append(words[i].charAt(0));
            }
            sb.append("ma");
            Collections.nCopies(t++,Character.valueOf('a')).stream().forEach(c->sb.append(c));
            words[i]=sb.toString();
        }
        return String.join(" ",words);
    }
}
