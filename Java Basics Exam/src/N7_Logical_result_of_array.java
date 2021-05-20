import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N7_Logical_result_of_array {
    //Given array of boolean elements calculate logical and and or operators on array elements
    //Input Format
    //Given n - length of array next n lines represnt array elements true or false
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        boolean[] arr = new boolean[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = Boolean.parseBoolean(bufferedReader.readLine().trim());
        }
        boolean and = arr[0], or = arr[0];
        for (int i = 1; i < arr.length; i++) {
            and &= arr[i];
            or |= arr[i];
        }
        System.out.println(and + "\n" + or);
    }
}
