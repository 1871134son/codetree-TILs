import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        if(n.equals('S')){
            System.out.println("Superior");
        }
        else if(n.equals('A')){
            System.out.println("B");
        }
        else if(n.equals('B')){
            System.out.println("Excellent");
        }
        else if(n.equals('C')){
            System.out.println("Good");
        }
        else if(n.equals('D')){
            System.out.println("Usually");
        }
        else{
            System.out.println("Faulure");
        }
        
    }
}