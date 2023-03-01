/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl
{
    public int firstBadVersion(int n)
    {
        int left=1;
        int right=n;
        if(isBadVersion(1))
        {
            return 1;
        }
        while((right-left)>1)
        {
            int mid=(int)((1L+left+right)/2);
            if(isBadVersion(mid))
            {
                right=mid;
            }
            else
            {
                left=mid;
            }
        }
        return right;
    }
}
