import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = n * n;

        System.out.println(r);
        if(n < 5){
            System.out.println("tiny");
        }
    }
}