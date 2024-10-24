import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int point = sc.nextInt();
        int more = 0;
        if(point > 80){
            System.out.println("pass");
        }
        else
        System.out.println((100-more)+" more score");
    }
}