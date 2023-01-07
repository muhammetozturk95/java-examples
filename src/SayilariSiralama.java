import java.util.Scanner;

public class SayilariSiralama {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("1.sayi : ");
        a = input.nextInt();

        System.out.print("2.sayi : ");
        b = input.nextInt();

        System.out.print("3.sayi : ");
        c = input.nextInt();

        if((a == b) || (a == c) || (b == c)) {
            System.out.println("Gecersiz giris");
        }

        if((a < b) && (a < c)) {
            if(b < c) {
                System.out.println("a < b < c");
            };
            if(c < b) {
                System.out.println("a < c < b");
            }
        } else if((b < a) && (b < c)) {
            if(a < c) {
                System.out.println("b < a < c");
            };
            if(c < a) {
                System.out.println("b < c < a");
            }
        } else {
            if(a < b) {
                System.out.println("c < a < b");
            };
            if(b < a) {
                System.out.println("c < b < a");
            }
        }
    }
}
