class Solution
{
    public int[] deckRevealedIncreasing(int[] deck)
    {
        Queue<Integer> qu = new LinkedList<>(){{for(int i=0;i<deck.length;add(i++));}};
        for(int d : Arrays.stream(deck).sorted().toArray())
        {
            deck[qu.poll()]=d;
            qu.add(qu.poll());
        }
        return deck;
    }
}
