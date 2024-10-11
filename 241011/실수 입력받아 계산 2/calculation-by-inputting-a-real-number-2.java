import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if(a>=1 && a <=100){
           System.out.printf("%.2f\n",a+1.5);
        }
    }
}