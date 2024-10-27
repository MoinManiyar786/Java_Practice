import java.util.Scanner;
public class Vovels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char a = input.next().charAt(0);
        if (a== 'a' || a=='A' || a=='e' || a=='E' || a=='i' || a=='I' || a=='o' || a=='O' || a=='u' || a=='U' ){
            System.out.println(a +" "+ "Is the vovels word ");

        }else System.out.println(a +  " " + "is not the vovel word");
        input.close();
    }
}
