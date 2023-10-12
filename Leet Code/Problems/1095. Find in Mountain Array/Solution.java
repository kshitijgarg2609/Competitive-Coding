/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution
{
    public int findInMountainArray(int target, MountainArray mountainArr)
    {
        for(int i=0,peak=0,len=mountainArr.length();i<3;i++)
        {
            for(int left=(i==0)?1:((i==1)?0:peak),right=(i==0)?(len-2):((i==1)?peak:(len-1));left<=right;)
            {
                int mid=(left+right)/2;
                int arr[] = new int[]{((i==0)?mountainArr.get(mid-1):0),mountainArr.get(mid),((i==0)?mountainArr.get(mid+1):0)};
                if(i==0 && arr[0]<arr[1] && arr[1]>arr[2])
                {
                    peak=mid;
                    break;
                }
                else if((i==0 && arr[0]<arr[1] && arr[1]<arr[2]) || (i==1 && arr[1]<target) || (i==2 && arr[1]>target))
                {
                    left=mid+1;
                }
                else if((i==0 && arr[0]>arr[1] && arr[1]>arr[2]) || (i==1 && arr[1]>target) || (i==2 && arr[1]<target))
                {
                    right=mid-1;
                }
                else if(arr[1]==target)
                {
                    return mid;
                }
            }
        }
        return -1;
    }
}
