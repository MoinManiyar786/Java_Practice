import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number to swap: ");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Numbers before swap: " +a+ " "+b);
        a = a-b;
        b= a+b;
        a = b-a;
        System.out.println("Numbers After swap: " +a+ " "+b);




    }
}
