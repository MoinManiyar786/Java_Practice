import java.util.Scanner;
public class Table5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the table from 1 to 10 ");
        int num = input.nextInt();
        for (int i = num;i<=100;i=i+num){
            System.out.println(i);
        }
    }
}
