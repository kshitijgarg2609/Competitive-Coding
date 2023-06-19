class Solution
{
    public int[] distributeCandies(int candies, int num_people)
    {
        int arr[] = new int[num_people];
        int i=1,indx=0;
        for(;i<candies;arr[indx++]+=i,indx%=num_people,candies-=i,i++);
        arr[indx]+=candies;
        return arr;
    }
}
