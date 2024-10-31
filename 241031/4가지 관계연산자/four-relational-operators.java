import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(1<=a && 1<=b && a <=10 && b <= 10){
            if(a>=b){
                System.out.println(1);
            }
            else
            System.out.println(0);
            if(a>b){
                System.out.println(1);
            }
            else
            System.out.println(0);
            if(a<=b){
                System.out.println(1);
            }
            else
            System.out.println(0);
            if(a<b){
                System.out.println(1);
            }
            else
            System.out.println(0);
        }
    }
}