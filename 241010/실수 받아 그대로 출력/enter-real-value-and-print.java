import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        if(n <= 50 && n >= 0){
            System.out.printf("%.2f\n",n);
        }
    }
}