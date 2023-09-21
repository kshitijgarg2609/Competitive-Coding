class Solution
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        Deque<Integer> list = new ArrayDeque<>();
        for(int i=0,j=0,k=0;k<=(nums1.length+nums2.length)/2;k++)
        {
            if(i<nums1.length && j<nums2.length)
            {
                list.add(((nums1[i]<=nums2[j])?nums1[i++]:nums2[j++]));
            }
            else
            {
                list.add(((i<nums1.length)?nums1[i++]:nums2[j++]));
            }
            if(list.size()>2)
            {
                list.removeFirst();
            }
        }
        return ((nums1.length+nums2.length)%2==0)?((list.getFirst()+list.getLast())/2.0):(list.getLast()/1.0);
    }
}
