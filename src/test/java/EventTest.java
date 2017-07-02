import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_getsGuestNumber_10() {
    Event testEvent = new Event(10, "food", "drinks", "entertainment");
    assertEquals(10, testEvent.getGuestNumber());
  }

  @Test
  public void newEvent_getsFoodChoice_food() {
    Event testEvent = new Event(10, "food", "drinks", "entertainment");
    assertEquals("food", testEvent.getFoodChoice());
  }

  @Test
  public void newEvent_getsDrinksChoice_drinks() {
    Event testEvent = new Event(10, "food", "drinks", "entertainment");
    assertEquals("drinks", testEvent.getDrinksChoice());
  }

  @Test
  public void newEvent_getsEntertainmentChoice_entertainment() {
    Event testEvent = new Event(10, "food", "drinks", "entertainment");
    assertEquals("entertainment", testEvent.getEntertainmentChoice());
  }

  @Test
  public void newEvent_calculateTotalGuests10_150() {
    Event testEvent = new Event(10, "food", "drinks", "entertainment");
    assertEquals(150, testEvent.calculateTotalGuests());
  }

  @Test
  public void newEvent_calculateTotalGuests25_230() {
    Event testEvent = new Event(25, "food", "drinks", "entertainment");
    assertEquals(230, testEvent.calculateTotalGuests());
  }

  @Test
  public void newEvent_calculateTotalGuests99_300() {
    Event testEvent = new Event(99, "food", "drinks", "entertainment");
    assertEquals(300, testEvent.calculateTotalGuests());
  }

  @Test
  public void newEvent_calculateTotalGuests1000_0() {
    Event testEvent = new Event(1000, "food", "drinks", "entertainment");
    assertEquals(0, testEvent.calculateTotalGuests());
  }

  @Test
  public void newEvent_calculateTotalDinnerFor10_200() {
    Event testEvent = new Event(10, "Dinner", "drinks", "entertainment");
    assertEquals(200, testEvent.calculateTotalFood());
  }

  @Test
  public void newEvent_calculateTotalSnacksFor10_100() {
    Event testEvent = new Event(10, "Snacks", "drinks", "entertainment");
    assertEquals(100, testEvent.calculateTotalFood());
  }

  @Test
  public void newEvent_calculateTotalFoodFor10_0() {
    Event testEvent = new Event(10, "food", "drinks", "entertainment");
    assertEquals(0, testEvent.calculateTotalFood());
  }

  @Test
  public void newEvent_calculateTotalAlcoholFor10_70() {
    Event testEvent = new Event(10, "dinner", "Alcoholic", "entertainment");
    assertEquals(70, testEvent.calculateTotalDrinks());
  }

  @Test
  public void newEvent_calculateTotalSoftDrinksFor10_20() {
    Event testEvent = new Event(10, "Dinner", "Soft", "entertainment");
    assertEquals(20, testEvent.calculateTotalDrinks());
  }

  @Test
  public void newEvent_calculateTotalDrinksFor10_0() {
    Event testEvent = new Event(10, "Dinner", "drinks", "entertainment");
    assertEquals(0, testEvent.calculateTotalDrinks());
  }

  @Test
  public void newEvent_calculateTotalLiveMusic_150() {
    Event testEvent = new Event(10, "Dinner", "drinks", "Live Music");
    assertEquals(150, testEvent.calculateTotalEntertainment());
  }

  @Test
  public void newEvent_calculateTotalClown_100() {
    Event testEvent = new Event(10, "Dinner", "drinks", "Clown");
    assertEquals(100, testEvent.calculateTotalEntertainment());
  }

  @Test
  public void newEvent_calculateTotalNoEntertainment_0() {
    Event testEvent = new Event(10, "Dinner", "drinks", "no");
    assertEquals(0, testEvent.calculateTotalEntertainment());
  }

  @Test
  public void newEvent_calculateGrandTotal4Guests_0() {
    Event testEvent = new Event(2, "Dinner", "soft", "no");
    assertEquals(0, testEvent.calculateGrandTotal());
  }

  @Test 
  public void newEvent_calculateGrandTotal10Guests_270() {
    Event testEvent = new Event(10, "Snacks", "Soft", "no");
    assertEquals(270, testEvent.calculateGrandTotal());
  }

  @Test
  public void isDJFRee_80DinnerAlcohol_true() {
    Event testEvent = new Event(80, "Dinner", "Alcoholic", "no");
    assertEquals(true, testEvent.isDJFree());
  }

  @Test
  public void isDJFRee_80DinnerSoft_false() {
    Event testEvent = new Event(80, "Dinner", "Soft", "no");
    assertEquals(false, testEvent.isDJFree());
  }

  @Test
  public void newEvent_calculateGrandTotalDiscount_220() {
    Event testEvent = new Event(10, "Snacks", "Soft", "no");
    String discount = "FIFTYoff";
    testEvent.calculateGrandTotal();
    assertEquals(220, testEvent.calculateDiscount(discount));
  }
}
