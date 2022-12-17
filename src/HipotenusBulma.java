import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args){
        double dikKenar1, dikKenar2, karelerToplami, hipotenus;

        Scanner input = new Scanner(System.in);

        //kullanicidan dik kenarlar istenir.
        System.out.print("Birinci dik kenari giriniz: ");
        dikKenar1 = input.nextInt();

        System.out.print("Ikinci dik kenari giriniz: ");
        dikKenar2 = input.nextInt();

        karelerToplami = Math.pow(dikKenar1 , 2) + Math.pow(dikKenar2, 2); //karekok islemini kisaltmak icin karelerin toplamini onceden aldik
        hipotenus = Math.round(Math.sqrt(karelerToplami) * 100d) / 100d; //sqrt ile karekok alinir. round methoduyla virgulden sonra iki basamak olmasini sagladik.

        System.out.println("birinci dik kenar: " + dikKenar1);
        System.out.println("ikinci dik kenar: " + dikKenar2);
        System.out.println("hipotenüs: " + hipotenus);

    }
}

