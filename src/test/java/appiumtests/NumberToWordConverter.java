package appiumtests;

public class NumberToWordConverter {
    private static final String[] ones = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static String convert(int number) {
        if (number == 0) {
            return "zero";
        } else if (number < 0) {
            return "minus " + convert(-number);
        }

        if (number < 20) {
            return ones[number];
        } else if (number < 100) {
            return tens[number / 10] + " " + ones[number % 10];
        } else if (number < 1000) {
            return ones[number / 100] + " hundred " + convert(number % 100);
        } else if (number < 1000000) {
            return convert(number / 1000) + " thousand " + convert(number % 1000);
        } else if (number < 1000000000) {
            return convert(number / 1000000) + " million " + convert(number % 1000000);
        } else {
            return convert(number / 1000000000) + " billion " + convert(number % 1000000000);
        }
    }

//   public static void main(String[] args) {
//     NumberToWordConverter  $obj = new NumberToWordConverter();
//System.out.println($obj.convert(7));
//    }
}