
import java.util.Scanner;
public class Mod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a%b ;
        System.out.println("The modulus of a number is "+c);
    }
}
