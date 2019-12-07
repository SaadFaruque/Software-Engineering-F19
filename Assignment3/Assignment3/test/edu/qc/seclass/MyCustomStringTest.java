package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp() {
        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown() {
        mycustomstring = null;
    }

    //this tests to see if CountNumbers can extract random number placement in a string
    @Test
    public void testCountNumbers1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(9, mycustomstring.countNumbers());
    }
    //This tests to see if countNumbers works with a string with no numbers
    @Test
    public void testCountNumbers2() {
    	 mycustomstring.setString("I really hope this test passes!");
         assertEquals(0, mycustomstring.countNumbers());
    }
    //This tests to see if countNumbers can work with an empty string
    @Test
    public void testCountNumbers3() {
    	 mycustomstring.setString("");
         assertEquals(0, mycustomstring.countNumbers());
    }
    //This tests to see if countNumbers works with a string that's all numbers
    @Test
    public void testCountNumbers4() {
    	mycustomstring.setString("55996789");
        assertEquals(8, mycustomstring.countNumbers());
    }

    //This tests to see if countNumbers works with numbers in the end of the string
    @Test
    public void testCountNumbers5() {
    	mycustomstring.setString("I really hope this test passes!5");
        assertEquals(1, mycustomstring.countNumbers());
    }
    //This tests to see if countNumbers throws exception for null string
    @Test(expected = NullPointerException.class)
    public void testCountNumbers6() {
    	mycustomstring.setString(null);
    	mycustomstring.countNumbers();
    	fail("should have thrown an exception!");
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }
    //this tests if the method works with only numbers
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd3() {
        mycustomstring.setString("12544542");
        assertEquals("1544", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
    }
    //this tests if method works with excessive spacing
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
    	mycustomstring.setString("     ooo    ooo   oooo");
        assertEquals("   o  oo oo", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
    }
    //this tests if method works with n set to one(should print out original string
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {
    	mycustomstring.setString("I want the original!");
        assertEquals("I want the original!", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, true));
    }
    //this tests if method works with n set to one for original string with startfromend false
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
    	mycustomstring.setString("I want the original!");
        assertEquals("I want the original!", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, false));
    }
    //this tests method with excessive spacing with startFromEnd false
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
    	mycustomstring.setString("     ooo    ooo   oooo");
        assertEquals("  oo  o  oo", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false));
    }
    //this tests method with only one character 
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
    	mycustomstring.setString("I");
        assertEquals("I", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, true));
    }
    //this tests method with only one character with startFromEnd false
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
    	mycustomstring.setString("I");
        assertEquals("I", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, false));
    }
    //this tests if method will work with only spaces
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
    	mycustomstring.setString("    ");
        assertEquals("  ", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
    }
    //this tests if method will work with start from end false
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
    	mycustomstring.setString("    ");
        assertEquals("  ", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false));
    }
    //this tests if method throws exception at null string 
    @Test(expected = NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
    	mycustomstring.setString(null);
    	mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, true);
    	fail("should have thrown an exception!");
    }
    //this tests if method throws exception at n being 0
    @Test(expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
    	mycustomstring.setString("Hi there, throw me an exception!");
    	mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, true);
    	fail("should have thrown an exception!");
    }
    //this tests if method throws exception at n being less than 0
    @Test(expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
    	mycustomstring.setString("Hi there, throw me an exception!");
    	mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-2, true);
    	fail("should have thrown an exception!");
    }

    @Test
    public void testConvertDigitsToNamesInSubstring1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOnesix1ts in this 5tr1n6, right?", mycustomstring.getString());
        			
    }
    //this tests if method works with no numbers
    @Test
    public void testConvertDigitsToNamesInSubstring2() {
    	 mycustomstring.setString("What if there are no numbers?");
         mycustomstring.convertDigitsToNamesInSubstring(1, 5);
         assertEquals("What if there are no numbers?", mycustomstring.getString());
    }
    //this tests if method works with number at end
    @Test
    public void testConvertDigitsToNamesInSubstring3() {
    	 mycustomstring.setString("What if there are no numbers5?");
         mycustomstring.convertDigitsToNamesInSubstring(1, 29);
         assertEquals("What if there are no numbersFive?", mycustomstring.getString());
    }
    //this tests if method works with numbers in a row
    @Test
    public void testConvertDigitsToNamesInSubstring4() {
    	mycustomstring.setString("49552");
        mycustomstring.convertDigitsToNamesInSubstring(1, 5);
        assertEquals("Fourninefivefivetwo", mycustomstring.getString());
    }
    //this tests if method works with numbers with words in between
    @Test
    public void testConvertDigitsToNamesInSubstring5() {
    	mycustomstring.setString("4NO9NO552");
        mycustomstring.convertDigitsToNamesInSubstring(1, 9);
        assertEquals("FourNONineNOFivefivetwo", mycustomstring.getString());
    }
    //this tests if exception thrwon if start is bigger than end
    @Test(expected = IllegalArgumentException.class)
    public void testConvertDigitsToNamesInSubstring6() {
    	mycustomstring.setString("4NO9NO552");
        mycustomstring.convertDigitsToNamesInSubstring(9, 1);
        fail("You're supposed to throw an exception!");
    }
    //this tests if exception thrown when end is out of bounds
    @Test(expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring7() {
    	mycustomstring.setString("4NO9NO552");
        mycustomstring.convertDigitsToNamesInSubstring(1, 21);
        fail("You're supposed to throw an exception!");
    }
    //this tests if exception thrown at null string
    @Test(expected = NullPointerException.class)
    public void testConvertDigitsToNamesInSubstring8() {
    	mycustomstring.setString(null);
        mycustomstring.convertDigitsToNamesInSubstring(1, 2);
        fail("You're supposed to throw an exception!");
    }

}
