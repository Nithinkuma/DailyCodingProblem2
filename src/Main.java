import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  lines = br.readLine();
        String[] strs = lines.trim().split(" ");

        long product = 1;
        List<Long> inputArray = new ArrayList<>();
        for (String str : strs) {
            inputArray.add(Long.parseLong(str));
            product *= Long.parseLong(str);
        }

        List<Long> outputArray = new ArrayList<>();

        System.out.println(transformedArray(product,inputArray,outputArray));

    }

    private static List<Long> transformedArray(long product,List<Long> inputArray,List<Long> outputArray) {
        for(double i : inputArray){
            outputArray.add((long) (product/i));
        }
        return outputArray;
    }
}