import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {

        int matematik, fizik, kimya, turkce, muzik;
        double ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notu: ");
        matematik = input.nextInt();

        if(matematik < 0 || matematik > 100){
            matematik = 0;
        }

        System.out.print("Fizik notu: ");
        fizik = input.nextInt();

        if(fizik < 0 || fizik > 100){
            fizik = 0;
        }

        System.out.print("Kimya notu: ");
        kimya = input.nextInt();

        if(kimya < 0 || kimya > 100){
            kimya = 0;
        }

        System.out.print("Türkçe notu: ");
        turkce = input.nextInt();

        if(turkce < 0 || turkce > 100){
            turkce = 0;
        }

        System.out.print("Müzik notu: ");
        muzik = input.nextInt();

        if(muzik < 0 || muzik > 100){
            muzik = 0;
        }

        ortalama = ((matematik + fizik + kimya + turkce + muzik) / 5);

        if(ortalama > 55) {
            System.out.println("Sınıfı geçtiniz! Ortalamanız: " + ortalama );
        } else {
            System.out.println("Sınıfta kaldınız! Ortalamanız: " + ortalama);
        }
    }
}

