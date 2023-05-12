import java.security.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte msg[] = md.digest(input.getBytes());
        StringBuilder sb = new StringBuilder();
        for(byte b : msg)
        {
            sb.append(String.format("%02x",Integer.valueOf(Byte.toUnsignedInt(b))));
        }
        System.out.println(sb);
    }
}
