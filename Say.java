import java.util.List;
import java.util.ArrayList;

class Say {

    static String[] singleDigit = {
        "zero",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine"
    };
    
    static String[] tensDigit = {
        "twenty",
        "thirty",
        "forty",
        "fifty",
        "sixty",
        "seventy",
        "eighty",
        "ninety"
    };

    static String[] specialNumbers = {
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen"
    };

    static String hundredsDigit = "hundred";
    static String thousandsDigit = "thousand";
    static String millionsDigit = "million";
    static String billionsDigit = "billion";
    
    static List<Long> splitDigits(Long i) {
        List<Long> splitDigits = new ArrayList<Long>();
        while (i > 0) {
            splitDigits.add(i % 10);
            i /= 10;
        }
        return splitDigits;
    }

    public static void main(String[] arguments) {
        for (int i = 0; i < arguments.length; i += 3) {
            if (i = 0) {
                int[] hundredsList = [5];
            }
        }

        Long[] convertedInput = new Long[arguments.length];

        for (int j = 0; j < arguments.length; j++) {
            convertedInput[j] = Long.parseLong(arguments[j]);
            List<Long> separatedDigits = Say.splitDigits(convertedInput[0]);
        }
    }
}
