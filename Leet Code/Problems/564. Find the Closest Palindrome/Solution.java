class Solution
{
    public String nearestPalindromic(String n)
    {
        long value=Long.parseLong(n);
        List<Long> list = Arrays.asList(
            halfToPalindrome(n,-1),
            halfToPalindrome(n,0),
            halfToPalindrome(n,1),
            (long)(Math.pow(10,n.length()-1)-1),
            (long)(Math.pow(10,n.length())+1));
        return list.stream().filter(val->val.longValue()!=value).sorted((a,b)->{int c1=Long.compare(Math.abs(a-value),Math.abs(b-value)),c2=Long.compare(a,b);return (c1!=0)?c1:c2;}).findFirst().get().toString();
    }
    public long halfToPalindrome(String n,int digitChange)
    {
        int mid=(n.length()-1)/2;
        long firstHalf=Long.parseLong(n.substring(0,mid+1))+digitChange;
        for(long lastHalf=((n.length()%2==0)?firstHalf:(firstHalf/10));
        lastHalf>0;
        firstHalf=((firstHalf*10)+(lastHalf%10)),lastHalf/=10);
        return firstHalf;
    }
}
