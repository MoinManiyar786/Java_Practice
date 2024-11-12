import java.util.Scanner;
public class Pros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        switch(num){
            case 1 :
                System.out.println("Light On");
                break;
            case 0 :
                System.out.println("Light off");
                break;
            default:
                System.out.println("Try again");
        }
    }
}
