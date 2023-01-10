import java.util.Scanner;

public class ArtikYilSorgulama {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("Yil Giriniz: ");
        year = input.nextInt();

        if(year % 100 != 0) {
            if(year % 4 == 0) {
                System.out.println(year + " artik yildir.");
            } else {
                System.out.println(year + " artik yil degildir.");
            }
        } else {
            if(year % 400 == 0) {
                System.out.println(year + " artik yildir.");
            } else {
                System.out.println(year + " artik yil degildir.");
            }
        }
    }
}
