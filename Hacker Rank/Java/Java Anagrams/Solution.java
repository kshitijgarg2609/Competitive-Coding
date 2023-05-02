import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b)
    {
        return java.util.Arrays.equals(a.toLowerCase().chars().sorted().toArray(), b.toLowerCase().chars().sorted().toArray());
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
