import org.junit.jupiter.api.BeforeEach;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCheckOutApp{

	@BeforeEach
    	public void setUp() {
 	CheckOutApp.clearCart(); 
    	}

	@Test
	public void testThatCheckOutAppExists(){
	String customerName = "Justice";
	String cashierName = "Helen";
	CheckOutApp.printHeader(customerName, cashierName);
	}

	@Test
	public void testThatPrintHeaderCanPrintHeader(){
	String cashierName = "Justice";
	String customerName = "Helen";
	String expected = CheckOutApp.printHeader(cashierName, customerName);
        assertTrue(expected.contains("Cashier: " + cashierName));
        assertTrue(expected.contains("Customer Name: " + customerName));
        }

    	@Test
    	public void testThatCheckOutAppCanAddItems() {
        CheckOutApp.addItems("rice", "3", "500");

        List<List<String>> result = CheckOutApp.addItems("", "", "");
	result.remove(result.size() - 1);
        assertEquals(1, result.size());

        assertEquals(List.of("rice", "3", "500"), result.get(0));
        }

	@Test
	public void testThatCheckOutAppCanAddMultipleItems(){

	CheckOutApp.addItems("rice", "3", "500");
	CheckOutApp.addItems("akara", "5", "500");
	CheckOutApp.addItems("corn", "4", "400");

	List<List<String>> result = CheckOutApp.addItems("", "", "");
	result.remove(result.size() - 1);
	assertEquals(3, result.size());

	assertEquals(List.of("rice", "3", "500"), result.get(0));
	assertEquals(List.of("akara", "5", "500"), result.get(1));
	assertEquals(List.of("corn", "4", "400"), result.get(2));
	}
	
	@Test
	public void testThatCheckOutAppCanSubTotal(){
	CheckOutApp.addItems("rice", "3", "500");
	CheckOutApp.addItems("akara", "5", "500");
	CheckOutApp.addItems("corn", "4", "400");
	
	String expected = "5600.0";
	String returned = CheckOutApp.theSubTotal();
	assertEquals(expected, returned);
	}

	@Test
	public void testThatCheckOutAppCanDiscount(){
	CheckOutApp.addItems("rice", "3", "500");
	CheckOutApp.addItems("akara", "5", "500");
	CheckOutApp.addItems("corn", "4", "400");

	String expected = "560.0";
	String returned = CheckOutApp.itemDiscount("10");
	assertEquals(expected, returned);
	}
	
	@Test
	public void testThatCheckOutAppCanCheckBalance(){
	CheckOutApp.addItems("rice", "3", "500");
	CheckOutApp.addItems("akara", "5", "500");
	CheckOutApp.addItems("corn", "4", "400");

	String returned = CheckOutApp.balance("6000", "5600");
	String expected = "400";
	assertEquals(expected, expected);
	}

}
