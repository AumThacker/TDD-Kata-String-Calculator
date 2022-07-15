/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;
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
    public void emptyString() throws Exception {
        assertEquals(cal.Add(""), 0);
    }

    @Test
    public void singleNumber() throws Exception {
        assertEquals(cal.Add("1"), 1);
    }

    @Test
    public void twoNumbers() throws Exception {
        assertEquals(cal.Add("1,2"), 3);
    }
    
    @Test
    public void unknownNumbers() throws Exception {
        assertEquals(cal.Add("1,2,3,4"),10);
    }
    
    @Test
    public void twoNumbersNewLine() throws Exception {
        assertEquals(cal.Add("1\n2"),3);
    }
    
    @Test
    public void customDelimiter() throws Exception {
        assertEquals(cal.Add("//;\n1;2"),3);
    }
    
    @Test(expected = Exception.class)
    public void negativeNumber() throws Exception {
        cal.Add("-1\n-2,3");
    }
    
    @Test
    public void ignoreNumber() throws Exception{
        assertEquals(cal.Add("1,1001,2"),3);
    }
}
