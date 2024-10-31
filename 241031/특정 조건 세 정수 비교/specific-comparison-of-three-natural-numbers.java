import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int l = 0;

        if(a<b && a < c){
            l = a;
        }
        else if(a<b && c<b && c<a){
            l = c;
        }
        else{
            l = b;
        }

        if(a== l){
            System.out.printf("1 ");
        }
        else{
            System.out.printf("0 ");
        }
        if(a==b && b == c){
            System.out.printf("1");
        }
        else{
            System.out.println(0);
        }
    }
}