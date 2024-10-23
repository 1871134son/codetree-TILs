import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = a + b;
        double average = sum / 2.0;
        System.out.printf("%d %.1f\n",sum,average);
    }
}