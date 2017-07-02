import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Welcome to our all-inclusive party planning service!" + '\n' + "Please enter your party details to see the estimated cost." + '\n' + "You can have from 5 to 100 guests." + '\n' + "Now enter number of your guests.");
    String strGuestNumber = myConsole.readLine();
    int intGuestNumber = Integer.parseInt(strGuestNumber);
    System.out.println("What would you prefer? Please enter Snacks or Dinner.");
    String strFoodChoice = myConsole.readLine();
    System.out.println("What kind of drinks would your party like? Please enter Alcoholic or Soft.");
    String strDrinksChoice = myConsole.readLine();
    System.out.println("Would you like any entertainment? Please enter Clown, Live Music or No.");
    String strEntertainmentChoice = myConsole.readLine();

    Event yourEvent = new Event(intGuestNumber, strFoodChoice, strDrinksChoice, strEntertainmentChoice);

    System.out.println("Review your party details: " + intGuestNumber + " guests.");
    System.out.println("Rental: " + yourEvent.calculateTotalGuests());
    System.out.println(strFoodChoice + " $" + yourEvent.calculateTotalFood());
    System.out.println(strDrinksChoice + ": $" + yourEvent.calculateTotalDrinks());
    System.out.println(strEntertainmentChoice + ": $" + yourEvent.calculateTotalEntertainment());
    System.out.println("Your party total cost is: $" + yourEvent.calculateGrandTotal());

    System.out.println("Would you like to get a $50 discount with your order? If so enter the coupon code FIFTYoff. If not enter No.");
    String discount = myConsole.readLine();
    System.out.println("Please review your total cost: $" + yourEvent.calculateDiscount(discount));

    if (yourEvent.isDJFree() == true) {
      System.out.println("Your party got a free DJ. Thank you for booking your party with us.");
    } else {
      System.out.println("Thank you for booking your party with us!");
    }


  }
}
