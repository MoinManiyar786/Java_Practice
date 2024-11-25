import java.util.Scanner;
public class Fun2 {
    public static void main(String[] args) {
        sum();
    }

    public static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num 1 : ");
        int a = input.nextInt();
        System.out.println("Enter num 2 : ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("REsult is = " + sum);
    }
}
