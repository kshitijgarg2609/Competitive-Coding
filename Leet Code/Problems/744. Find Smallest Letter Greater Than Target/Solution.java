class Solution
{
    public char nextGreatestLetter(char[] letters, char target)
    {
        int left=0-1;
        int right=letters.length;
        while((right-left)>1)
        {
            int mid=(left+right+1)/2;
            if(letters[mid]>target)
            {
                right=mid;
            }
            else
            {
                left=mid;
            }
        }
        return (right==letters.length)?letters[0]:letters[right];
    }
}
