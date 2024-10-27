import java.util.Scanner;
public class Year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = input.nextInt();
        if((year %4==0 && year %100 !=0) || (year%400 == 0)) {
            System.out.println(year + "Is the leap year");
        }
        else {
            System.out.println(year + "year is not Leap year");
        }
    }
}
