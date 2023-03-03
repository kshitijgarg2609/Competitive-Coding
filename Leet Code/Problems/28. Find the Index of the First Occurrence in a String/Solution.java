class Solution
{
    public int strStr(String haystack, String needle)
    {
        if(needle.length()>haystack.length())
        {
            return -1;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                list.add(i);
            }
        }
        for(int i=1;i<needle.length() && list.size()>0;i++)
        {
            Iterator<Integer> it = list.iterator();
            while(it.hasNext())
            {
                int indx=it.next();
                if((indx+i)>=haystack.length() || haystack.charAt((indx+i))!=needle.charAt(i))
                {
                    it.remove();
                }
            }
        }
        return (list.size()>0)?list.get(0):-1;
    }
}
