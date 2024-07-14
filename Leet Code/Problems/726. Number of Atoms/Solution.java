class Solution
{
    public String countOfAtoms(String formula)
    {
        Stack<Map<String,Integer>> stack = new Stack<>(){{push(new HashMap<>());}};
        Queue<Character> qu = new LinkedList<>(){{for(int i=0;i<formula.length();add(formula.charAt(i++)));}};
        while(!qu.isEmpty())
        {
            StringBuilder element = new StringBuilder();
            int digit=0;
            char c = qu.remove();
            if(Character.isUpperCase(c))
            {
                for(element.append(c);!qu.isEmpty() && Character.isLowerCase(qu.peek());element.append(qu.remove()));
            }
            else if(c=='(')
            {
                stack.push(new HashMap<>());
                continue;
            }
            for(;!qu.isEmpty() && Character.isDigit(qu.peek());digit=(digit*10)+(qu.remove()-'0'));
            if(digit==0)
            {
                digit=1;
            }
            if(c!=')')
            {
                stack.peek().put(element.toString(),stack.peek().getOrDefault(element.toString(),0)+digit);
            }
            else
            {
                for(Map.Entry<String,Integer> ent : stack.peek().entrySet())
                {
                    ent.setValue(digit*ent.getValue());
                }
                Map<String,Integer> map = stack.pop();
                for(Map.Entry<String,Integer> ent : map.entrySet())
                {
                    stack.peek().put(ent.getKey(),stack.peek().getOrDefault(ent.getKey(),0)+ent.getValue());
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String,Integer> ent : new TreeMap<>(stack.pop()).entrySet())
        {
            sb.append(ent.getKey());
            if(ent.getValue()>1)
            {
                sb.append(ent.getValue());
            }
        }
        return sb.toString();
    }
}
