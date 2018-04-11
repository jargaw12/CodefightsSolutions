import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheJourneyBeginsTest {

    @Test
    public void addTest() {
        TheJourneyBegins theJourneyBegins=new TheJourneyBegins();
        Assert.assertEquals(3,theJourneyBegins.add(1,2));
    }

    @Test
    public void centuryFromYearTest() {
        TheJourneyBegins theJourneyBegins=new TheJourneyBegins();
        Assert.assertEquals(20,theJourneyBegins.centuryFromYear(1905));
    }

    @Test
    public void checkPalindromeTest() {
        TheJourneyBegins theJourneyBegins=new TheJourneyBegins();
        Assert.assertTrue("InputString is a palindrome",theJourneyBegins.checkPalindrome("hlbeeykoqqqokyeeblh"));
    }
}