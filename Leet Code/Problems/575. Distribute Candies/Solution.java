class Solution
{
    public int distributeCandies(int[] candyType)
    {
        int cnt_type=(int)Arrays.stream(candyType).sorted().distinct().count();
        int limit=candyType.length/2;
        return (cnt_type>=limit)?limit:cnt_type;
    }
}
