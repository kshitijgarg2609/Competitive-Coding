class Solution
{
    public List<String> twoEditWords(String[] queries, String[] dictionary)
    {
        List<String> list = new ArrayList<>();
        for(String q : queries)
        {
            int edits=q.length();
            for(String d : dictionary)
            {
                int mismatch=(int)IntStream.range(0,q.length()).filter(i->q.charAt(i)!=d.charAt(i)).count();
                if(mismatch<=2 && mismatch<edits)
                {
                    edits=mismatch;
                }
            }
            if(edits<=2)
            {
                list.add(q);
            }
        }
        return list;
    }
}
