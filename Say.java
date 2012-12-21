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
        "",
        "",
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
    
    static Integer[] splitNumber(String userNumber) {
        int length = userNumber.length();
        Integer[] splitNumber = new Integer[length];
        for (int i = 0; i < length; i++) {
            splitNumber[i] = Integer.valueOf(userNumber.substring(length - 1 - i, length - i));
        }
        return splitNumber;
    }

    static String[] spellNumber(Integer[] arrayNumber) {
        int length = arrayNumber.length;
        String[] spellNumber = new String[length];
        for (int i = 0; i < length; i++) {
            if (i == 1 || i == 4 || i == 7 || i == 10 && arrayNumber[i] != 1) {
                spellNumber[i] = tensDigit[arrayNumber[i]];
            } else if (i == 1 || i == 4 || i == 7 || i == 10 && arrayNumber[i] == 1) {
                spellNumber[i] = specialNumbers[arrayNumber[i]];
            } else {
                spellNumber[i] = singleDigit[arrayNumber[i]];
            }
        }
        return spellNumber;
    }


    static String spellWholeNumber(String[] spelledNumber) {
        int length = spelledNumber.length;
        String wholeNumber = "";
        for (int i = 0; i < length; i++) {
            if (i == 0 && spelledNumber[i] == "zero" && length == 1) {
                wholeNumber = " " + spelledNumber[i];
            } else if (i == 0 && spelledNumber[i] == "zero" && length > 1) {
                wholeNumber = wholeNumber;                   
            }  else if (i != 0 && spelledNumber[i] == "zero") {
                wholeNumber = wholeNumber;
            } else if (i == 2 || i == 5 || i == 8 || i == 11) {
                wholeNumber = " " + spelledNumber[i] + " " + hundredsDigit + wholeNumber;
            } else if (i == 3) {
                wholeNumber = " " + spelledNumber[i] + " " + thousandsDigit + wholeNumber;
            } else if (i == 6) {
                wholeNumber = " " + spelledNumber[i] + " " + millionsDigit + wholeNumber;
            } else if (i == 9) {
                wholeNumber = " " + spelledNumber[i] + " " + billionsDigit + wholeNumber;
            } else {
                wholeNumber = " " + spelledNumber[i] + wholeNumber;
            }
        }
        wholeNumber = wholeNumber.substring(1);
        return wholeNumber;
    }

    public static void main(String[] arguments) {
        Integer[] inputArray = Say.splitNumber(arguments[0]);
        String[] spelledDigits = Say.spellNumber(inputArray);
        String spelledFinal = Say.spellWholeNumber(spelledDigits);
        System.out.println(spelledFinal);    
    }
}
