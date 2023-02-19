import java.util.Scanner;

public class Bolunebilme {
    public static void main(String[] args) {
        int num;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.println("Give a number: ");
        num = input.nextInt();

        for(int i = 0; i <= num; i++) {
            if(i%3 == 0 && i%4 == 0)
                System.out.println(i);
        }
    }
}
