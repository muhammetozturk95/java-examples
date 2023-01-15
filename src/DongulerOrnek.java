/*
0'dan girilen sayiya kadar 3 veya 4'e bolunebilen sayilarin ortalamsini hesaplayan program.
 */

import java.util.Scanner;

public class DongulerOrnek {
    public static void main(String[] args) {
        int n, toplam = 0;
        double ortalama, counter = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        n = input.nextInt();

        for(int i = 0; i <= n; i++) {
            if(i % 3 == 0 || i % 4 == 0) {
                toplam += i;
                counter++;
            }
        }

        ortalama = toplam / counter;
        System.out.println("ortalama: " + Math.round(ortalama * 100d) / 100d); // Virgulden sonra iki basamak gosterebilmek icin.

    }
}
