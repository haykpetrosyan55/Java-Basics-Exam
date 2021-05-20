import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1_Weekday_2 {
    //Your task is to scan two numbers a and print corresponding
    // weekday on STDOUT. For example if a=1 priint Monday
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine().trim());
        String weekday = "Your weekday is ";
        switch (a){
            case 1:
                weekday += "Monday";
                break;
            case 2:
                weekday += "Tuesday";
                break;
            case 3:
                weekday += "Wednesday";
                break;
            case 4:
                weekday += "Thursday";
                break;
            case 5:
                weekday += "Friday";
                break;
            case 6:
                weekday += "Saturday";
                break;
            case 7:
                weekday += "Sunday";
                break;
        }
        System.out.println(weekday);
    }
}
