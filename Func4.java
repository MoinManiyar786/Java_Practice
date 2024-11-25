import java.util.Scanner;
public class Func4 {
    public static void main(String[] args) {
        int result = sum();
        System.out.println("The result is " + result);
    }
    public static int sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value 1: ");
        int a = input.nextInt();
        System.out.println("Enter he secong vallue 2: ");
        int b = input.nextInt();
        int sum = a + b;
        return sum;
    }
}
