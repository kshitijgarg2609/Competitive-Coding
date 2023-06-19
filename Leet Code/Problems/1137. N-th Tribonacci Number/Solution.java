class Solution
{
    public int tribonacci(int n)
    {
        List<Integer> list = new LinkedList<>(Arrays.asList(0,1,1));
        for(int i=3;i<=n;i++)
        {
            list.add(list.stream().mapToInt(Integer::intValue).sum());
            list.remove(0);
        }
        return n<3?list.get(n):list.get(2);
    }
}
