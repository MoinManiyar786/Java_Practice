import java.util.Scanner;
public class Eop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num %2==0){
            System.out.println("The number is Even: "+num);
        }else System.out.println("The number id odd:  " + num);
    }
}