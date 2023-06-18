class Solution
{
    public String removeDuplicates(String s)
    {
        Deque<Character> dq = new LinkedList<>();
        for(char c : s.toCharArray())
        {
            if(dq.isEmpty())
            {
                dq.addLast(c);
            }
            else if(dq.peekLast()==c)
            {
                dq.removeLast();
            }
            else
            {
                dq.addLast(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!dq.isEmpty())
        {
            sb.append(dq.removeFirst());
        }
        return sb.toString();
    }
}
