class Solution
{
    public List<String> fullJustify(String[] words, int maxWidth)
    {
        List<String> list = new LinkedList<>();
        for(int i=0;i<words.length;)
        {
            int start_indx=i,space_grps=0,space=maxWidth-words[i].length();
            for(int exp_length=words[i++].length();i<words.length && (exp_length+words[i].length()+1)<=maxWidth;exp_length+=words[i].length()+1,space-=words[i].length(),space_grps++,i++);
            StringBuilder sb = new StringBuilder(maxWidth);
            sb.append(words[start_indx++]);
            int fix_space=(space_grps==0)?space:((i==words.length)?1:(space/space_grps));
            int extra_space_grps=(space_grps==0||i==words.length)?0:(space%space_grps);
            while(space_grps-->0)
            {
                for(int j=1;j<=fix_space;j++)
                {
                    sb.append(' ');
                }
                if(extra_space_grps-->0)
                {
                    sb.append(' ');
                }
                sb.append(words[start_indx++]);
            }
            for(;sb.length()<maxWidth;sb.append(' '));
            list.add(sb.toString());
        }
        return list;
    }
}
