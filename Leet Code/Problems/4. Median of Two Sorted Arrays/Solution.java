class Solution
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int l1=nums1.length;
        int l2=nums2.length;
        int l=l1+l2;
        int lm=l/2;
        int prev=0;
        int next=0;
        int i=0,i1=0,i2=0;
        while(i<=lm && i1<l1 && i2<l2)
        {
            prev=next;
            if(nums1[i1]<=nums2[i2])
            {
                next=nums1[i1++];
            }
            else
            {
                next=nums2[i2++];
            }
            i++;
        }
        while(i<=lm && i1<l1)
        {
            prev=next;
            next=nums1[i1++];
            i++;
        }
        while(i<=lm && i2<l2)
        {
            prev=next;
            next=nums2[i2++];
            i++;
        }
        if((l%2)==0)
        {
            return (prev+next)/2.0;
        }
        else
        {
            return next;
        }
    }
}
