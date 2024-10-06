class Solution
{
    public boolean areSentencesSimilar(String sentence1, String sentence2)
    {
        Deque<String> dq1 = new LinkedList<>(Arrays.asList(sentence1.split(" ")));
        Deque<String> dq2 = new LinkedList<>(Arrays.asList(sentence2.split(" ")));
        while(!dq1.isEmpty() && !dq2.isEmpty() && dq1.peek().equals(dq2.peek()))
        {
            dq1.remove();
            dq2.remove();
        }
        while(!dq1.isEmpty() && !dq2.isEmpty() && dq1.peekLast().equals(dq2.peekLast()))
        {
            dq1.removeLast();
            dq2.removeLast();
        }
        return dq1.isEmpty() || dq2.isEmpty();
    }
}
