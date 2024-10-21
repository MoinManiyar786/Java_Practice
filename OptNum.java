import java.util.Scanner;
import java.util.stream.Stream;
public class OptNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three number ti compare: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max = Math.max(a, Math.max(b, c));
        System.out.println("The Greater number is : " + max);
    }
}
