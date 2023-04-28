class Solution
{
    public int numSimilarGroups(String[] strs)
    {
        int cnt=0;
        Set<Integer> indx = IntStream.range(0,strs.length).boxed().collect(Collectors.toSet());
        while(indx.size()>0)
        {
            Iterator<Integer> it = indx.iterator();
            Queue<Integer> qu = new LinkedList<>();
            qu.add(it.next());
            it.remove();
            while(!qu.isEmpty())
            {
                String fix = strs[qu.remove()];
                it = indx.iterator();
                while(it.hasNext())
                {
                    int match_indx = it.next();
                    String match = strs[match_indx];
                    int diff = 0;
                    for(int i=0;i<match.length();i++)
                    {
                        if(match.charAt(i)!=fix.charAt(i))
                        {
                            diff++;
                        }
                    }
                    if(diff==0 || diff==2)
                    {
                        it.remove();
                        qu.add(match_indx);
                    }
                }
            }
            cnt++;
        }
        return cnt;
    }
}
