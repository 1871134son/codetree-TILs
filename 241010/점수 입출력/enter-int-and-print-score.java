import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n >= 1 && n <= 1000){
            System.out.printf("Your score is %d point\n", n);
        }
    }
}