import java.util.Scanner;
public class Nega {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value to check if its positive or not: ");
        int a = input.nextInt();
        if (a<0) System.out.println("The value is negative");
        else System.out.println("The value is positive");
    }
}
