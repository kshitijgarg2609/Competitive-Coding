class Solution
{
    public int finalValueAfterOperations(String[] operations)
    {
        return Arrays.stream(operations).mapToInt(o->o.contains("++")?1:-1).sum();
    }
}
