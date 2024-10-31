import java.util.Scanner;
public class Xor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Values before Swap: "+a+" "+b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Values after Swap: " +a + " "+b);
    }
}
