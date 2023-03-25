//www.patika.dev
import java.util.Scanner;

public class dongulertwo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        System.out.print("sayı giriniz:");
        number= input.nextInt();
        for(int i=1,j=1; i<number && j<number;i*=4, j*=5) {
            System.out.println( i + " "+ j);
        }
    }
}
