import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args){
        //değişkenler tanımlanır
        double acilisUcreti = 10, kmUcreti = 2.20;
        double gidilenMesafe, tutar;

        //Scanner sınıfı tanımlanır.
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan gidilen mesafe istenir
        System.out.print("Gidilen mesafeyi giriniz: ");
        gidilenMesafe = input.nextDouble();

        //Gidilen mesafeye göre tutar hesaplanır
        tutar = acilisUcreti + (gidilenMesafe * kmUcreti);
        tutar = tutar < 20 ? 20 : tutar; // minimum ödenecek tutar kontrolü yapılır.

        System.out.println("Gidilen mesafe: " + gidilenMesafe + " km");
        System.out.println("Ödenecek tutar: " + tutar + " TL");
    }
}

