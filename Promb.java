import java.util.Scanner;
public class Promb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Input Here ");
        String str = input.next();
        switch(str){
            case "on" :
                System.out.println("Light On");
                break;
            case "off" :
                System.out.println("Light off");
                break;
            default:
                System.out.println("Try again");
        }
    }
}
