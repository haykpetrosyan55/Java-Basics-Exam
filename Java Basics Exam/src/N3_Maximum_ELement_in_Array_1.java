import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N3_Maximum_ELement_in_Array_1 {
    //Your task is to scan array of numbers and find maximum elemen of the given array
    //Input Format
    //Given number n - number of elements in array following n lines are for each element of array
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int[] arr = new int[n];
        int max = 0;
        for (int i : arr) {
            i = Integer.parseInt(bufferedReader.readLine().trim());
            max = Math.max(max,i);
        }
        System.out.println(max);
    }
}
