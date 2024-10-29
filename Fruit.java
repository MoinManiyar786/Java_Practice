import java.util.Scanner;
public class Fruit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Fruit name: ");
        String fruit = input.next();

        switch(fruit){
            case "mango":
                System.out.println("King of Fruit");
                break;
            case "banana":
                System.out.println("Sweet fruit");
                break;
            case "orange":
                System.out.println("Nagpur best seller");
                break;
            default:
                System.out.println("Enter the valid fruit");
        }


    }
}
o