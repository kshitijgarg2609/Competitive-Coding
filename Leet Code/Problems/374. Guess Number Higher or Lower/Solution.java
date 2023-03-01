/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame
{
    public int guessNumber(int n)
    {
        int left=1;
        int right=n;
        int mid=0;
        while(left<=right)
        {
            mid=(int)((1L+left+right)/2);
            if(0>guess(mid))
            {
                right=mid-1;
            }
            else if(0<guess(mid))
            {
                left=mid+1;
            }
            else
            {
                break;
            }
        }
        return mid;
    }
}
