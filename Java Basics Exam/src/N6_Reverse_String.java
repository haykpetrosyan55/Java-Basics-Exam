import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N6_Reverse_String {
    //Your task is to scan string s and print reversed string.
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine().trim();
        StringBuilder revers = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            revers.append(s.charAt(i));
        }
        System.out.println(revers);
    }
}
