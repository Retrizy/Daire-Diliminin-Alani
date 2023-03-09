import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int r;
        double pi=3.14,a,Alan;
        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yaricapini giriniz.");
        r = input.nextInt();

        System.out.println("Daire diliminin acisini giriniz.");
        a = input.nextDouble();

        Alan = (r*pi*r)*(a/360);
        System.out.println("Daire diliminin alani = "+Alan);


    }
}