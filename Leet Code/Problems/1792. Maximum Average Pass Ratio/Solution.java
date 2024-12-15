class Solution
{
    public double maxAverageRatio(int[][] classes, int extraStudents)
    {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Double.compare((((double)(b[0]+1))/(b[1]+1))-(((double)b[0])/b[1]),(((double)(a[0]+1))/(a[1]+1))-(((double)a[0])/a[1])));
        Arrays.stream(classes).forEach(cl->pq.add(new int[]{cl[0],cl[1]}));
        for(int i=1;i<=extraStudents;i++)
        {
            pq.add(new int[]{pq.peek()[0]+1,pq.remove()[1]+1});
        }
        return pq.stream().mapToDouble(i->(1.0*i[0])/i[1]).sum()/classes.length;
    }
}
