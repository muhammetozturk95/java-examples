import java.util.Scanner;

public class UcgenAlaniHesaplama {
    public static void main(String[] args) {
        double birinciKenar, ikinciKenar, ucuncuKenar, cevre, u, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("birinci kenari giriniz: ");
        birinciKenar = input.nextDouble();

        System.out.print("ikinci kenari giriniz: ");
        ikinciKenar = input.nextDouble();

        System.out.print("ucuncu kenari giriniz: ");
        ucuncuKenar = input.nextDouble();

        /*
        alan hesabı yapabilmemiz için üçgen oluşturma şartı kontrol edilmelidir.
        kural: üçgenin herhangi bir kenarı diğer iki kenarın toplamından küçük, farkından büyük olmalıdır.
        buna göre aşağıda bu koşul sağlanırsa çevreyi hesaplıyoruz. koşul sağlamazsa program hata verecektir.
         */

        cevre = (birinciKenar + ikinciKenar > ucuncuKenar) && (Math.abs(birinciKenar - ikinciKenar) < ucuncuKenar)
                ? birinciKenar + ikinciKenar + ucuncuKenar
                : null;

        u = cevre / 2;

        alan = Math.sqrt(u * (u - birinciKenar) * (u - ikinciKenar) * (u - ucuncuKenar));

        System.out.println("ucgenin cevresi: " + cevre);
        System.out.println("ucgenin alani: " + alan);

    }
}

