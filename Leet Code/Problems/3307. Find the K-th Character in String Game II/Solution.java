class Solution
{
    public char kthCharacter(long k, int[] operations)
    {
        int power2=0,op=0;
        for(long length=2;k>length;length*=2,power2++);
        for(;power2>=0;power2--)
        {
            long length=(long)(Math.pow(2,power2));
            if(k>length)
            {
                k-=length;
                op+=(power2<operations.length)?operations[power2]:0;
            }
        }
        return (char)('a'+op%26);
    }
}
