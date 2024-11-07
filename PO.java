import java.util.Scanner;
public class PO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character to start from: ");
        char ch = input.next().charAt(0);
        for (char i = ch; i <='z';i++)
            System.out.println(i);
    }
}
