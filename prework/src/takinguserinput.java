import java.util.Scanner;
public class takinguserinput {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int x = input.nextInt();
        float f =input.nextFloat();
        double d = x+f ;
        System.out.println(d);
    }
}
