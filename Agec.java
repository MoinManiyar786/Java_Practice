import java.util.Scanner;
public class Agec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = input.nextInt();
        if (age <= 12) System.out.println("You are Child");
        else if(age <= 20) System.out.println("You are Teenager");
        else if(age <= 30) System.out.println("You are Adult");
        else System.out.println("You are Senior");
        input.close();
    }
}
