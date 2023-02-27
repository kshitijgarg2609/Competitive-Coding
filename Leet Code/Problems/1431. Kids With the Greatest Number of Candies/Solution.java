class Solution
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        int max_candy=Arrays.stream(candies).max().getAsInt();
        List<Boolean> list = new ArrayList<>(candies.length);
        Arrays.stream(candies).forEach(x->list.add((x+extraCandies)>=max_candy));
        return list;
    }
}
