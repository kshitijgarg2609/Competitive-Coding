class Solution
{
    public double average(int[] salary)
    {
        return (Arrays.stream(salary).boxed().mapToDouble(Integer::doubleValue).sum()-Arrays.stream(salary).max().getAsInt()-Arrays.stream(salary).min().getAsInt())/(salary.length-2);
    }
}
