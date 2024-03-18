class Solution
{
    public int findMinArrowShots(int[][] points)
    {
        int cnt=0;
        Arrays.sort(points,Comparator.comparingInt((int[] a)->a[0]).thenComparingInt((int[] a)->a[1]));
        for(int i=0;i<points.length;cnt++)
        {
            int rng[] = new int[]{points[i][0],points[i++][1]};
            for(;i<points.length && (rng[1]>=points[i][1] || rng[1]>=points[i][0]);i++)
            {
                rng = new int[]{Integer.max(rng[0],points[i][0]),Integer.min(rng[1],points[i][1])};
            }
        }
        return cnt;
    }
}
