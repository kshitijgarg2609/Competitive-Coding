class Solution
{
    public String reverseVowels(String s)
    {

        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        char arr[] = s.toCharArray();
        int left=-1;
        int right=arr.length;
        while(++left<--right)
        {
            while(left<right && !set.contains(Character.toLowerCase(arr[left])))
            {
                left++;
            }
            while(left<right && !set.contains(Character.toLowerCase(arr[right])))
            {
                right--;
            }
            if(left>=right)
            {
                break;
            }
            char tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
        }
        return new String(arr);
    }
}
