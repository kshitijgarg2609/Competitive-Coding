class Solution
{
    public String clearStars(String s)
    {
        List<Stack<Integer>> list = new LinkedList<>(){{for(int i=0;i++<26;add(new Stack<>()));}};
        char arr[] = s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(Character.isLetter(arr[i]))
            {
                list.get(arr[i]-'a').push(i);
            }
            else
            {
                for(int j=0;j<26;j++)
                {
                    if(!list.get(j).isEmpty())
                    {
                        arr[list.get(j).pop()]='*';
                        break;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        IntStream.range(0,arr.length).filter(i->arr[i]!='*').forEach(i->sb.append(arr[i]));
        return sb.toString();
    }
}
