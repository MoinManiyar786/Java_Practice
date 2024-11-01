import java.util.Objects;
import java.util.Scanner;
public class Gpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------Welcome the Mygpt-------------------------------------------------");
        System.out.println("Enter your prompt: ");
        String str = input.nextLine();
        if(Objects.equals(str, "Hello")) System.out.println("Hello how are you");
        else if (Objects.equals(str, "your name")) System.out.println("Hey my name is Mygpt");
        else if (Objects.equals(str, "how are you")) System.out.println("Hey i am fine what about you");
        else if (Objects.equals(str, "how was your day")) System.out.println("Its amazing");
        else System.out.println("Sorry i cant Understand");
        input.close();
    }
}
