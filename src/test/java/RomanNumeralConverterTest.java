import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RomanNumeralConverterTest {


    @Test
    public void testConvertVTo5() throws InvalidParameterException {

        RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();
        assertEquals(5,romanNumeralConverter.convertRomanNumeral("V"));
    }

    @Test
    public void testConvertITo1() {

        RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();
        assertEquals(1,romanNumeralConverter.convertRomanNumeral("I"));
    }

    @Test
    public void testConvertXTo10() {

        RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();
        assertEquals(10,romanNumeralConverter.convertRomanNumeral("X"));
    }


    @Test
    public void testConvertIITo2() {

        RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();
        assertEquals(2,romanNumeralConverter.convertRomanNumeral("II"));
    }

    @Test
    public void testConvertVIITo7() {

        RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();
        assertEquals(7, romanNumeralConverter.convertRomanNumeral("VII"));
    }


    @Test
    public void testConvertIVTo4() {

        RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();
        assertEquals(4,romanNumeralConverter.convertRomanNumeral("IV"));
    }

    @Test
    public void testConvertLargeValue()  {

        RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();
        assertEquals(5636,romanNumeralConverter.convertRomanNumeral("MMMMMDCXXXVI"));
    }

    @Test (expected = InvalidParameterException.class)
    public void testInvalidString() {

        RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();
        assertNotEquals(123,romanNumeralConverter.convertRomanNumeral("adsd"));
    }








}

