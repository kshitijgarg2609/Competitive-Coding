class Solution
{
    public int calPoints(String[] operations)
    {
        List<Integer> list = new ArrayList<>();
        for(String str : operations)
        {
            switch(str)
            {
                case "C":
                {
                    list.remove(list.size()-1);
                    break;
                }
                case "D":
                {
                    list.add(2*list.get(list.size()-1));
                    break;
                }
                case "+":
                {
                    list.add(list.get(list.size()-1)+list.get(list.size()-2));
                    break;
                }
                default:
                {
                    list.add(Integer.valueOf(str));
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}
