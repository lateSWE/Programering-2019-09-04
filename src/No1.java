import java.util.Scanner;

public class No1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        while(true){
            System.out.print("Enter a number: ");
            int in = sc.nextInt();
            total += in;
            System.out.println("The total is " + total);
        }
    }
}
