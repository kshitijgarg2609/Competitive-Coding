class Solution
{
    public boolean isCircularSentence(String sentence)
    {
        List<char[]> list = Arrays.stream(sentence.split(" ")).map(str->new char[]{str.charAt(0),str.charAt(str.length()-1)}).collect(Collectors.toList());
        for(int i=1;i<list.size();i++)
        {
            if(list.get(i-1)[1]!=list.get(i)[0])
            {
                return false;
            }
        }
        return list.get(0)[0]==list.get(list.size()-1)[1];
    }
}
