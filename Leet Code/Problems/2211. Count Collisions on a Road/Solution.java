class Solution
{
    public int countCollisions(String directions)
    {
        int l=0,r=directions.length()-1;
        for(;l<directions.length() && directions.charAt(l)=='L';l++);
        for(;l<=r && directions.charAt(r)=='R';r--);
        return (int)IntStream.rangeClosed(l,r).filter(i->directions.charAt(i)!='S').count();
    }
}
