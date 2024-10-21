import java.util.Scanner;

public class Sub {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        a = input.nextInt();
        b = input.nextInt();
        c = a-b;
        System.out.println("Subtraction is " + c);
    }
}