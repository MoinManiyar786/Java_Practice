import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Score to findout grade: ");
        int score = input.nextInt();
        if(score >= 90) System.out.println("your grade is A");
        else if(score >= 60) System.out.println("Your grade is B");
        else System.out.println("Your grade is C");
        input.close();
    }
}
