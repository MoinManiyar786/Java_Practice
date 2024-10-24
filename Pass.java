import java.util.Scanner;
public class Pass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Password: ");
        String str = input.nextLine();
        int len = str.length();
        if(len >= 12) System.out.println("Password is Strong");
        else if(len >= 8) System.out.println("Password is intermediate");
        else System.out.println("not strong ");

    }
}
