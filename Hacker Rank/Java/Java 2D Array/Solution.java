import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        int sum=Integer.MIN_VALUE;
        for(int i=1;i<arr.size()-1;i++)
        {
            for(int j=1;j<arr.size()-1;j++)
            {
                int hr_glass=arr.get(i).get(j)+arr.get(i-1).subList(j-1,j+2).stream().mapToInt(Integer::intValue).sum()+arr.get(i+1).subList(j-1,j+2).stream().mapToInt(Integer::intValue).sum();
                sum=Integer.max(sum,hr_glass);
            }
        }
        System.out.println(sum);
    }
}
