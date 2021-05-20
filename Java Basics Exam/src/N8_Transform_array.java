import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N8_Transform_array {
    //Your task is to scan array of numbers and create array where each element is true or false depending on
    // if element in scanned array of the same posittion is odd or event. If elemen is even
    // then item in second array is true otherwise false
    //Input Format
    //Given number n - number of elements in array following n lines are for each element of array
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int[] arr = new int[n];
        boolean[] transArr = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine().trim());
            transArr[i] = arr[i] % 2 == 0;
        }
        for (boolean aTransArr : transArr) {
            System.out.print(aTransArr + " ");
        }
    }
}
