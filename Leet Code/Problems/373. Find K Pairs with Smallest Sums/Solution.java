class Solution
{
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k)
    {
        List<List<Integer>> list = new LinkedList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(nums1[a[0]]+nums2[a[1]],nums1[b[0]]+nums2[b[1]])){{add(new int[]{0,0});}};
        Set<int[]> vis = new TreeSet<>((a,b)->((a[0]!=b[0])?Integer.compare(a[0],b[0]):Integer.compare(a[1],b[1]))){{add(new int[]{0,0});}};
        for(;k>0 && !pq.isEmpty();k--)
        {
            int root[] = pq.poll();
            int left[] = new int[]{root[0]+1,root[1]};
            int right[] = new int[]{root[0],root[1]+1};
            list.add(Arrays.asList(nums1[root[0]],nums2[root[1]]));
            if(left[0]<nums1.length && !vis.contains(left))
            {
                vis.add(left);
                pq.add(left);
            }
            if(right[1]<nums2.length && !vis.contains(right))
            {
                vis.add(right);
                pq.add(right);
            }
        }
        return list;
    }
}
