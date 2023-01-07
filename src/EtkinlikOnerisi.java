import java.util.Scanner;

public class EtkinlikOnerisi {
    public static void main(String[] args) {
        int temp;

        Scanner input = new Scanner(System.in);

        System.out.print("Sicaklik giriniz: ");
        temp = input.nextInt();

        if (temp < 5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if(temp >= 5 && temp < 25){
            if(temp < 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            };

            if(temp >= 10) {
                System.out.println("Piknik yapabilirsiniz.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
