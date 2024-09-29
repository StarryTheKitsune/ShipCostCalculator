import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double FREE_SHIPPING = 100;
        double SHIPPING_FEE = 0.02;
        double VALID_RANGE = 0;
        double totalPrice = 0;
        String trash = ""; // use for bad input which will read as a String

        System.out.println("Input item price: ");
        if(in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
            System.out.println("You said your item price was: $" + itemPrice + ".");
            if(itemPrice >= FREE_SHIPPING) {
                totalPrice = itemPrice;
                System.out.println("Your item was $" + itemPrice + ", which qualifies for free shipping! Your total price is " + totalPrice + ".");
            }
            else if (itemPrice <= VALID_RANGE) {
                System.out.println("You said your item price was: $" + itemPrice + ".");
                System.out.println("Run the program again and enter a valid amount!");


            }
            else {
                totalPrice = itemPrice + itemPrice * SHIPPING_FEE;
                System.out.println("Your item was $" + itemPrice + " which does NOT qualify for free shipping. A shipping fee of 2% has been added. Your total price is $" + totalPrice + ".");
            }
        }

        else
        {
            trash = in.nextLine();
            System.out.println("You said your item price was: $" + trash + ".");
            System.out.println("Run the program again and enter a valid amount!");
        }
    }

}