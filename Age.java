import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = input.nextInt();
        if (age < 18) System.out.println("Your not eligible for vote");
        else System.out.println("Your eligible for the vote");
    }
}
