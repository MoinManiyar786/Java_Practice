import java.util.Scanner;
public class Forl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number fot count");
        int num = input.nextInt();
        for(int i=1; i<=num; i++){
            System.out.println(i);
        }
    }
}
