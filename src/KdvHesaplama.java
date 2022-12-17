import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        //degiskenler tanimlanir
        double fiyat, kdvOrani, kdvTutari, toplamTutar;

        //Scanner sinifi tanimlanir
        Scanner input = new Scanner(System.in);

        //Kullanicidan deger alma
        System.out.print("Fiyati giriniz: ");
        fiyat = input.nextDouble();
        System.out.println("KDV'siz fiyat: " + fiyat + " TL");


        //kdv oraninin kosula gore belirlenmesi
        kdvOrani = (fiyat > 0 && fiyat < 1000) ? 0.18 : 0.08;
        System.out.println("KDV orani: " + kdvOrani);

        //kdv tutarinin hesaplanmasi
        kdvTutari = fiyat * kdvOrani;
        System.out.println("KDV tutari: " + Math.round(kdvTutari * 100d) / 100d);
        //ondalikli sayinin virgulden sonra iki basamak olacak sekilde ayarlanmasi icin Math.round() kullanildi.

        //toplam tutarin hesaplanmasi
        toplamTutar = fiyat + kdvTutari;
        System.out.println("Toplam tutar: " + Math.round(toplamTutar * 100d) / 100d + " TL");
    }
}

