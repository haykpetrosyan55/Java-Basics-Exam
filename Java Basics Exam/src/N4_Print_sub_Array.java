import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N4_Print_sub_Array {
    //Your task is to scan array of numbers and m number, print elemens of array until you reach the element with value m.
    // If there is no elemen with value m then print all array.
    //Input Format
    //Given number n - number of elements in array following n lines are for each element of array the last line is for m value
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine().trim());
        }
        int num = Integer.parseInt(bufferedReader.readLine().trim());
        for (int anArr : arr) {
            if (anArr != num) {
                System.out.print(anArr + " ");
            } else break;
        }
    }
}
