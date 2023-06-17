class Solution
{
    public String reverseOnlyLetters(String s)
    {
        char arr[] = s.toCharArray();
        List<Integer> indx = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(Character.isUpperCase(arr[i]) || Character.isLowerCase(arr[i]))
            {
                indx.add(i);
            }
        }
        int i=0,j=indx.size()-1;
        for(;i<j;arr[indx.get(i)]=s.charAt(indx.get(j)),arr[indx.get(j--)]=s.charAt(indx.get(i++)));
        return new String(arr);
    }
}
