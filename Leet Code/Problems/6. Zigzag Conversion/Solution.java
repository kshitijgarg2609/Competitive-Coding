class Solution
{
    public String convert(String s, int numRows)
    {
        if(numRows==1 || numRows>=s.length())
        {
            return s;
        }
        List<Integer> list = new LinkedList<>(){{add(0);}};
        for(int i=0;list.get(i)<s.length();list.add(list.get(i++)+(2*(numRows-1))));
        StringBuilder sb = new StringBuilder(s.length());
        for(int i=0;i<numRows;i++)
        {
            Set<Integer> set = new TreeSet<>();
            for(int indx : list)
            {
                if((indx+i)>=0 && (indx+i)<s.length())
                {
                    set.add(indx+i);
                }
                if((indx-i)>=0 && (indx-i)<s.length())
                {
                    set.add(indx-i);
                }
            }
            set.stream().forEach(indx->sb.append(s.charAt(indx)));
        }
        return sb.toString();
    }
}
