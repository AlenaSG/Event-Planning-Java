public class Event {
  private int mGuestNumber;
  private String mFoodChoice;
  private String mDrinksChoice;
  private String mEntertainmentChoice;
  
  public Event(int guestNumber, String foodChoice, String drinksChoice, String entertainmentChoice) {
    mGuestNumber = guestNumber;
    mFoodChoice = foodChoice;
    mDrinksChoice = drinksChoice;
    mEntertainmentChoice = entertainmentChoice;
  }


  public int getGuestNumber() {
    return mGuestNumber;
  }

  public String getFoodChoice() {
    return mFoodChoice;
  }

  public String getDrinksChoice() {
    return mDrinksChoice;
  }

  public String getEntertainmentChoice() {
    return mEntertainmentChoice;
  }

  public int calculateTotalGuests() {
    int totalGuests = 0;
    if ((mGuestNumber >= 5) && (mGuestNumber <= 20)) {
      totalGuests = 150;
    } else if ((mGuestNumber > 20) && (mGuestNumber <= 50)) {
      totalGuests = 230;
    } else if ((mGuestNumber > 50) && (mGuestNumber <= 100)) {
      totalGuests = 300;
    } else {
      return  0;
    }
    return totalGuests;
  }

  public int calculateTotalFood() {
    int  totalFood = 0;
    if (mFoodChoice.equals("Dinner")) {
      totalFood = 20 * mGuestNumber;
    } else if (mFoodChoice.equals("Snacks")) {
      totalFood = 10 * mGuestNumber;
    } else {
      return 0;
    }
    return totalFood;
  }

  public int calculateTotalDrinks() {
    int totalDrinks = 0;
    if (mDrinksChoice.equals("Alcoholic")) {
      totalDrinks = 7 * mGuestNumber;
    } else if (mDrinksChoice.equals("Soft")) {
      totalDrinks = 2 * mGuestNumber;
    } else {
      return 0;
    }
    return totalDrinks;
  }

  public int calculateTotalEntertainment() {
    int totalEntertainment = 0;
        if (mEntertainmentChoice.equals("Live Music")) {
      totalEntertainment = 150;
    } else if (mEntertainmentChoice.equals("Clown")) {
      totalEntertainment = 100;
    } else {
      return 0;
    }
    return totalEntertainment;
  }

  public int calculateGrandTotal() {
    int grandTotal = 0;
    if ((mGuestNumber > 4) && (mGuestNumber < 101)) {
      grandTotal =  calculateTotalGuests() + calculateTotalFood() + calculateTotalDrinks() + calculateTotalEntertainment();
    } else {
      return 0;
    }
    return grandTotal;
    }

//a coupon code that adds DJ service for free with any purchase of dinner and alcoholic drinks for 80+ people;
  public boolean isDJFree() {
    return ((mGuestNumber >= 80) && (mFoodChoice.equals("Dinner")) && (mDrinksChoice.equals("Alcoholic")));
  }

//a coupon code that takes $50 off the total price
  public int calculateDiscount(String discount) {
    int grandTotal = calculateGrandTotal();
    if (discount.equals("FIFTYoff")) {
      grandTotal -= 50;
    }
    return grandTotal;
  }

}
