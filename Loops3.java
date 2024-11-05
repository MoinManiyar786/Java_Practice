import java.util.Scanner;
public class Loops3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        long fac = 1;
        for(int i = 1;i<=num;i++){
            fac *= i;
        }
        System.out.println(fac);
    }
}
