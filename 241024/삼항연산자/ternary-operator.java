import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        String p = "pass";
        String f = "failure";

        String result = (score == 100) ? p : f;
        System.out.println(result);
    }
}