import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        int distance , age, flightType;
        double pricePerKm = 0.10, price, discountedPrice, totalPrice, discountRate;

        Scanner input = new Scanner(System.in);

        System.out.print("Input distance (km) : ");
        distance = input.nextInt();

        System.out.print("Input your age : ");
        age = input.nextInt();

        System.out.print("Select flight type (1 => Round trip, 2 => One way) : ");
        flightType = input.nextInt();

        if(!(distance > 0 && age > 0 && (flightType == 1 || flightType == 2))) { //error condition
            System.out.println("Error!");
        } else { //if all inputs are correct, age parameter should be checked to apply discount.
            if(age < 12) {
                discountRate = 0.5;
            }else if(age >= 12 && age <= 24) {
                discountRate = 0.1;
            }else {
                discountRate = 0.35;
            }

            price = distance * pricePerKm;
            discountedPrice = price - (price * discountRate);
            
            if(flightType == 1) {
                totalPrice = (discountedPrice - (discountedPrice * 0.2)) * 2;
            } else {
                totalPrice = discountedPrice;
            }
            System.out.println("Total price: " + totalPrice + " TL");
        }

    }
}
