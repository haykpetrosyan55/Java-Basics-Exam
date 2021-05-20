import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N5_Sum_of_digits {
    //Your task is to scan number a and calculate sum of digits in the number
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine().trim());
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        System.out.println(sum);
    }
}
