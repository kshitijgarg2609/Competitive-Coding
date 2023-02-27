class Solution
{
    public String reorderSpaces(String text)
    {
        int spaces=(int)text.chars().filter(x->x==' ').count();
        String words[] = text.trim().split("\\s+");
        for(String w : words)
        {
            System.out.println(w+" : "+w.length());
        }
        String dist="";
        if(words.length>1)
        {
            char spaces_fill[] = new char[spaces/(words.length-1)];
            Arrays.fill(spaces_fill,' ');
            dist=String.join((new String(spaces_fill)),words);
            spaces%=(words.length-1);
        }
        else
        {
            dist=words[0];
        }
        char extra_spaces[] = new char[spaces];
        Arrays.fill(extra_spaces,' ');
        return dist+(new String(extra_spaces));
    }
}
