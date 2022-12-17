import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        // değişkenler tanımlama
        int mat, fizik, kimya, biyo, tarih, muzik;

        // kullanıcıdan veri almak için Scanner sınıfını çağırma
        Scanner inp = new Scanner(System.in);

        //matematik
        System.out.print("Matematik notunu giriniz: ");
        mat = inp.nextInt();

        //fizik
        System.out.print("Fizik notunu giriniz: ");
        fizik = inp.nextInt();

        //kimya
        System.out.print("Kimya notunu giriniz: ");
        kimya = inp.nextInt();

        //biyoloji
        System.out.print("Biyoloji notunu giriniz: ");
        biyo = inp.nextInt();

        //tarih
        System.out.print("Tarih notunu giriniz: ");
        tarih = inp.nextInt();

        //müzik
        System.out.print("Müzik notunu giriniz: ");
        muzik = inp.nextInt();

        //ortalama hesaplama
        int toplam = mat + fizik + kimya + biyo + tarih + muzik;
        double notOrtalamasi = toplam / 6;
        System.out.println("Not ortalaması: " + notOrtalamasi);

        //sınıfı geçip geçmediğinin kontrolü
        String sinifGecmeDurumu = notOrtalamasi > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Geçme Durumu: " + sinifGecmeDurumu);
    }
}


