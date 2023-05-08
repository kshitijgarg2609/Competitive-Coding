public class Solution
{
    public static void main(String[] args)
    {
        printArray(new Integer[]{1,2,3});
        printArray(new String[]{"Hello","World"});
    }
    
    public static <E> void printArray(E array[])
    {
        for(E e : array)
        {
            System.out.println(e);
        }
    }
}
