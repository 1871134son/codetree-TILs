import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int firstOutput = (a <= b && a <= c) ? 1 : 0;

        int secondOutput = (a == b && b == c) ? 1 : 0;

        System.out.println(firstOutput + " " + secondOutput);

        sc.close();
    }
}