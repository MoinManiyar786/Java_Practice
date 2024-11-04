import java.util.Scanner;
public class LoopsP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int sum = 0;
        for (num = num;num <= 100 ;num++){
            if(num % 2==0){
                System.out.println(num);
                sum += num;
            }
        }
        System.out.println("the total sum is : "+ sum);
    }
}
