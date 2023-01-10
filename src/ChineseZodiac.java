import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        int yearOfBirth, remainder;
        String chineseZodiac = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");
        yearOfBirth = input.nextInt();

        remainder = yearOfBirth % 12;

        switch (remainder) {
            case 0:
                chineseZodiac = "monkey";
                break;
            case 1:
                chineseZodiac = "rooster";
                break;
            case 2:
                chineseZodiac = "dog";
                break;
            case 3:
                chineseZodiac = "pig";
                break;
            case 4:
                chineseZodiac = "rat";
                break;
            case 5:
                chineseZodiac = "ox";
                break;
            case 6:
                chineseZodiac = "tiger";
                break;
            case 7:
                chineseZodiac = "rabbit";
                break;
            case 8:
                chineseZodiac = "dragon";
                break;
            case 9:
                chineseZodiac = "snake";
                break;
            case 10:
                chineseZodiac = "horse";
                break;
            case 11:
                chineseZodiac = "sheep";
                break;
            default:
                System.out.println("Error!");
                break;
        }
        System.out.println("Your chinese zodiac is " + chineseZodiac);
    }
}
