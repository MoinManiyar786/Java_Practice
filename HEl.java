import java.util.Scanner;
public class HEl {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter value only shows the first word: ");
    String name = input.next();
    System.out.println("Enter value only shows the first word: ");
    String name1 = input.nextLine();
    System.out.println("The word is "+name);
        System.out.println("the full sentence is "+name1);
    input.close();
    }
}
