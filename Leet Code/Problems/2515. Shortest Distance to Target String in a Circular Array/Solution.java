class Solution
{
    public int closestTarget(String[] words, String target, int startIndex)
    {
        for(int i=0,l=startIndex,r=startIndex,d=0,n=words.length;i<n;i++,l=(l+n-1)%n,r=(r+1)%n,d++)
        {
            if(words[l].equals(target) || words[r].equals(target))
            {
                return d;
            }
        }
        return -1;
    }
}
