import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to count the character: ");
        String str = input.nextLine();
        int count = str.length();
        System.out.println(count);

    }
}
