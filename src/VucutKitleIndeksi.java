import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        int kilo, boy;
        double vucutKitleIndeksi;

        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        kilo = input.nextInt();

        System.out.print("Boyunuzu santimetre cinsinden giriniz: ");
        boy = input.nextInt();

        vucutKitleIndeksi = (kilo / Math.pow(boy, 2)) * Math.pow(10,4); // from cm2 to m2

        System.out.println("Boyunuz: " + boy + " cm");
        System.out.println("Kilonuz: " + kilo + " kg");
        System.out.println("Vücut Kitle İndeksiniz: " + Math.round(vucutKitleIndeksi * 100d) / 100d);
    }
}
