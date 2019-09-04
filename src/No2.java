import java.util.Scanner;

public class No2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter some text");
            String text = sc.nextLine();


            System.out.println("The reverse is: ");
            String reverse="";
            for (int i = text.length(); i < 0; i--) {
                System.out.print(text.charAt(i));
            }
        }
    }
}
