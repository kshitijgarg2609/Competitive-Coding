class Solution
{
    public List<Integer> diffWaysToCompute(String expression)
    {
        if(expression.length()<=2)
        {
            return expression.length()!=0?Arrays.asList(Integer.parseInt(expression)):Collections.emptyList();
        }
        List<Integer> list = new LinkedList<>();
        for(int i=0;i<expression.length();i++)
        {
            char c = expression.charAt(i);
            if(Character.isDigit(c))
            {
                continue;
            }
            List<Integer> left = diffWaysToCompute(expression.substring(0,i));
            List<Integer> right = diffWaysToCompute(expression.substring(i+1));
            for(int l : left)
            {
                for(int r : right)
                {
                    if(c=='+')
                    {
                        list.add(l+r);
                    }
                    else if(c=='-')
                    {
                        list.add(l-r);
                    }
                    else if(c=='*')
                    {
                        list.add(l*r);
                    }
                }
            }
        }
        return list;
    }
}
