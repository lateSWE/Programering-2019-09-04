import java.util.Scanner;

public class No2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            //frågar om en text input
            System.out.print("Enter some text to be reversed: ");
            String text = sc.nextLine();
            System.out.print("The reverse is: \"");

            //en "funktion" som skriver ut en string baklänges
            for (int i = text.length()-1; i >= 0; i--) {
                System.out.print(text.charAt(i));
            }
            System.out.print("\"");


            //lite spacing
            System.out.println();
            System.out.println();
        }
    }
}
