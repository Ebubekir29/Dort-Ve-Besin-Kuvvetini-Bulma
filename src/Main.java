import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi ;
        System.out.print("Bir sayi giriniz : ");
        sayi = scan.nextInt();

        for (int i =1;i<sayi;i++)
        {
            System.out.println("4^"+i+"="+(int)Math.pow(4,i)+" |"+" 5^"+i+"="+(int)Math.pow(5,i));
        }
    }
}
