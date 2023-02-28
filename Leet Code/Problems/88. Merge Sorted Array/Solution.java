class Solution
{
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int i=n;
        int j=0;
        int k;
        for(k=m-1;k>=0;k--)
        {
            nums1[k+n]=nums1[k];
        }
        k=0;
        while(i<(m+n) && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                nums1[k++]=nums1[i++];
            }
            else
            {
                nums1[k++]=nums2[j++];
            }
        }
        while(j<n)
        {
            nums1[k++]=nums2[j++];
        }
    }
}
