import java.util.Scanner;

public class DaireninAlaniCevresi {
    public static void main(String[] args) {
        int merkezAcisi, yaricap;
        double pi = 3.14, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Yaricapi cm cinsinden giriniz: ");
        yaricap = input.nextInt();

        System.out.print("Merkez acisini derece cinsinden giriniz: ");
        merkezAcisi = input.nextInt();

        alan = (pi * Math.pow(yaricap, 2) * merkezAcisi) / 360;

        System.out.println("Yaricapi " + yaricap + " cm" +
                ", merkez acisi " + merkezAcisi +
                " derece olan daire diliminin alani: " +
                Math.round(alan * 100d) / 100d + " cm2'dir.");
    }
}

