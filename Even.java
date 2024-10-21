import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to verify whether even or odd: ");
        int num = input.nextInt();
        if (num%2 == 0) System.out.println("The number is Even " + num);
        else System.out.println("The number is odd " +num);
    }
}
