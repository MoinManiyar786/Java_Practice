import java.util.Scanner;
public class Equal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        if (a == b) System.out.println("The numbers are Equals");
        else System.out.println("Numbers are not equal");
        input.close();
    }
}
