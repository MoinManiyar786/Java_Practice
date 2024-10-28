import java.util.Objects;
import java.util.Scanner;
public class Chat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the command: ");
        String str = input.nextLine();
        if (Objects.equals(str, "hello")) System.out.println("Hello how are you");
        else if(Objects.equals(str, "how are you")) System.out.println("I am fine");
        else System.out.println("Invalid prompt");
    }
}
