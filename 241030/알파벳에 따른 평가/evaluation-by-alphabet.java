import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        if(n=='S'){
            System.out.println("Superior");
        }
        else if(n=='A'){
            System.out.println("B");
        }
        else if(n=='B'){
            System.out.println("Excellent");
        }
        else if(n=='C'){
            System.out.println("Good");
        }
        else if(n=='D'){
            System.out.println("Usually");
        }
        else{
            System.out.println("Faulure");
        }
        
    }
}