import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for counting: ");
        int num = input.nextInt();
        int i = 1;
        while(i<=num){
            System.out.println(i);
            i++;
        }

    }
}