class Solution
{
    public int[] findThePrefixCommonArray(int[] A, int[] B)
    {
        Set<Integer> a=new HashSet<>(),b=new HashSet<>(),c=new HashSet<>();
        int arr[] = new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==B[i])
            {
                c.add(A[i]);
            }
            else
            {
                a.add(A[i]);
                b.add(B[i]);
                for(int num : new int[]{A[i],B[i]})
                {
                    if(a.contains(num) && b.contains(num))
                    {
                        a.remove(num);
                        b.remove(num);
                        c.add(num);
                    }
                }
            }
            arr[i]=c.size();
        }
        return arr;
    }
}
