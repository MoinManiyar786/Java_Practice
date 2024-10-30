import java.util.Scanner;
public class Light {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Traffic Signal: ");
        String str = input.next();
        switch (str){
            case "Green" -> System.out.println("Keep Moving the Car");
            case "Yellow" -> System.out.println("Make your Car Slow");
            case "Red" -> System.out.println("Stop your car");
            default -> System.out.println("Invalid input");
        }
    }
}
