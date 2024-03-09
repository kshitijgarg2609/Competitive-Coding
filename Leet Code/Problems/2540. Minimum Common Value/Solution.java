class Solution
{
    public int getCommon(int[] nums1, int[] nums2)
    {
        int mcv=-1;
        for(int i=0,j=0;i<nums1.length && j<nums2.length;)
        {
            if(nums1[i]<nums2[j])
            {
                i++;
            }
            else if(nums1[i]>nums2[j])
            {
                j++;
            }
            else
            {
                mcv=nums1[i];
                break;
            }
        }
        return mcv;
    }
}
