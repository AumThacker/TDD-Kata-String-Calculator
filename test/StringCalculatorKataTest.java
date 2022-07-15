/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import stringcalculatorkata.StringCalculatorKata;

/**
 *
 * @author Aum Thacker
 */
public class StringCalculatorKataTest {
    StringCalculatorKata cal;
    public StringCalculatorKataTest() {
    }

    /**
     * Test of main method, of class StringCalculatorKata.
     */
    @Before
    public void setUp() {
        cal = new StringCalculatorKata();
    }

    @Test
    public void emptyString() {
        assertEquals(cal.Add(""), 0);
    }

    @Test
    public void singleNumber() {
        assertEquals(cal.Add("1"), 1);
    }

    @Test
    public void twoNumbersCommaDelimited() {
        assertEquals(cal.Add("1,2"), 3);
    }
    
    @Test
    public void unknownNumbers() {
        assertEquals(cal.Add("1,2,3,4"),10);
    }
}
