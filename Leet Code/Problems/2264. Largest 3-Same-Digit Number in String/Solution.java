class Solution
{
    public String largestGoodInteger(String num)
    {
        return IntStream.rangeClosed(0,num.length()-3).mapToObj(i->num.substring(i,i+3)).filter(n->n.charAt(0)==n.charAt(1) && n.charAt(1)==n.charAt(2)).sorted(Collections.reverseOrder()).findFirst().orElse("");
    }
}
