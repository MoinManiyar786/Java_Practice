import java.util.Scanner;
public class Pnew {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number start from");
        int num = input.nextInt();
        int sum = 0;
        for (int i = num;i<=100;i++){
            if(i%2 !=0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
