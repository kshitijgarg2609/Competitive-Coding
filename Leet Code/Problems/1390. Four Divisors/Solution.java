class Solution
{
    public int sumFourDivisors(int[] nums)
    {
        return Arrays.stream(nums).boxed().map(num->IntStream.rangeClosed(1,(int)(Math.sqrt(num))).filter(n->num%n==0).mapToObj(n->Arrays.asList(n,num/n)).flatMap(l->l.stream()).collect(Collectors.toSet())).filter(set->set.size()==4).flatMap(set->set.stream()).mapToInt(Integer::intValue).sum();
    }
}
