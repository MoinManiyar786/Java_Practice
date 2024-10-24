import java.util.Scanner;
public class Traffic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The the signal: ");
        String str = input.nextLine();
        if (str == "Red") System.out.println("Stop the Car");
        else if(str == "yellow") System.out.println("Slow down the Car");
        else System.out.println("Drive the Car");
    input.close();
    }

}
