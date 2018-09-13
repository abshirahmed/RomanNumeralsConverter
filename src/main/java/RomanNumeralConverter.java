import java.security.InvalidParameterException;

public class RomanNumeralConverter {


    public int convertRomanNumeral(String romanNumeral) throws InvalidParameterException {
        if (romanNumeral.matches("[IVXLCDM]+")) {
            char[] romanNumeralArray = romanNumeral.toCharArray();
            return getConvertedSum(romanNumeralArray);
        } else
            throw new InvalidParameterException("Invalid String");
    }

    private int getConvertedSum(char[] romanNumeralArray) {
        int convertedSum = 0;
        for (int i = 0; i < romanNumeralArray.length; i++) {
            if (i < romanNumeralArray.length - 1 && convertSingleChar(romanNumeralArray[i]) < convertSingleChar(romanNumeralArray[i + 1])) {
                convertedSum -= convertSingleChar(romanNumeralArray[i]);
            } else {
                convertedSum += convertSingleChar(romanNumeralArray[i]);
            }
        }
        return convertedSum;
    }

    private int convertSingleChar(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }


}
