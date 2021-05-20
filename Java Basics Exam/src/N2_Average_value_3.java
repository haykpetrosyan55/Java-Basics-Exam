import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2_Average_value_3 {
    //Your task is to scan array of numbers and calculate average value for that array rounded up till next integer
    //Explanation 0
    //First line is 3 which indicates array length, next 3 lines are array elements [1,1,1]
    //average value will be (1 + 1 + 2)/3=1.5 rounded up to nearest integer will be 2
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int[] arr = new int[n];
        double sum = 0;
        for (int i : arr) {
            i = Integer.parseInt(bufferedReader.readLine().trim());
            sum += i;
        }
        System.out.println((int)(Math.ceil(sum/n)));
    }
}
