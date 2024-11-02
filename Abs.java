import java.util.Scanner;
public class Abs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = input.nextInt();
        switch(a){
            case 1 -> System.out.println("You win the iphone");
            case 2 -> System.out.println("You win nothing");
            case 3 -> System.out.println("Bad luck");
            case 4 -> System.out.println("You win Headphones");
            case 5 -> System.out.println("You win Speaker");
            case 6 -> System.out.println("Try Again");
            default -> System.out.println("Invalid input");
        }
        input.close();
    }
}
