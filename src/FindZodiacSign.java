import java.util.Scanner;

public class FindZodiacSign {
    public static void main(String[] args) {
        int month, day;
        boolean isError = false;
        String zodiacSign = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Input your birth month : ");
        month = input.nextInt();

        System.out.print("Input your birth day of month : ");
        day = input.nextInt();

        if(month >= 1 && month <= 12) {
            //january
            if(month == 1) {
                if(day > 1 && day <= 31) {
                    if(day < 20) {
                        zodiacSign = "Capricorn";
                    } else {
                        zodiacSign = "Aquarius";
                    }
                } else {
                    isError = true;
                }
            }

            //february
            if(month == 2) {
                if(day < 1 && day > 29) {
                    isError = true;
                } else if(day >= 19) {
                    zodiacSign = "Pisces";
                } else {
                    zodiacSign = "Aquarius";
                }
            }

            //march
            if(month == 3) {
                if(day < 1 && day > 31) {
                    isError = true;
                } else if(day <= 20) {
                    zodiacSign = "Pisces";
                } else {
                    zodiacSign = "Aries";
                }
            }

            //april
            if(month == 4) {
                if(day < 1 && day > 30) {
                    isError = true;
                } else if(day < 20) {
                    zodiacSign = "Aries";
                } else {
                    zodiacSign = "Taurus";
                }
            }

            //may
            if(month == 5) {
                if(day < 1 && day > 31) {
                    isError = true;
                } else if(day >= 21) {
                    zodiacSign = "Gemini";
                } else {
                    zodiacSign = "Taurus";
                }
            }

            //june
            if(month == 6) {
                if(day < 1 && day > 30) {
                    isError = true;
                } else if(day < 21) {
                    zodiacSign = "Gemini";
                } else {
                    zodiacSign = "Cancer";
                }
            }

            //july
            if(month == 7) {
                if(day < 1 && day > 31) {
                    isError = true;
                } else if(day >= 23) {
                    zodiacSign = "Leo";
                } else {
                    zodiacSign = "Cancer";
                }
            }

            //august
            if(month == 8) {
                if(day < 1 && day > 31) {
                    isError = true;
                } else if(day < 23) {
                    zodiacSign = "Leo";
                } else {
                    zodiacSign = "Virgo";
                }
            }

            //september
            if(month == 9) {
                if(day < 1 && day > 30) {
                    isError = true;
                } else if(day >= 23) {
                    zodiacSign = "Libra";
                } else {
                    zodiacSign = "Virgo";
                }
            }

            //october
            if(month == 10) {
                if(day < 1 && day > 31) {
                    isError = true;
                } else if(day < 23) {
                    zodiacSign = "Libra";
                } else {
                    zodiacSign = "Scorpio";
                }
            }

            //november
            if(month == 11) {
                if(day < 1 && day > 30) {
                    isError = true;
                } else if(day >= 22) {
                    zodiacSign = "Sagittarius";
                } else {
                    zodiacSign = "Scorpio";
                }
            }

            //december
            if(month == 12) {
                if(day < 1 && day > 31) {
                    isError = true;
                } else if(day < 22) {
                    zodiacSign = "Sagittarius";
                } else {
                    zodiacSign = "Capricorn";
                }
            }


            if(isError) {
                System.out.println("Input error!");
            } else {
                System.out.println("your zodiac sign is: " + zodiacSign);
            }
        } else {
            System.out.println("Input error!");
        }

    }
}