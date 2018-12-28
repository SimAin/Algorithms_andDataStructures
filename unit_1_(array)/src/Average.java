//A class with series of methods to manage a double array.
public class Average {

    //Find Sum of items in array.
    public static double findSum (double[] numbers) {
        double sum = 0.0;

        for (int i = 0; i < numbers.length; i = i + 1) {
            sum = sum + numbers[i];
        }

        return sum;
    }

    //Compute average of items in array.
    public static double computeAverage (double[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        } else {
            double sum = findSum (numbers);

            return sum/numbers.length;
        }
    }

    //Display array.
    public static String toArray(double[] numbers) {

        String result = ("The array: " );

        for (int i = 0; i < numbers.length; i = i + 1) {
            result = result + (numbers[i] + ", ");
        }
        return result;
    }

    //Double all values in array.
    public static double[] doubleArray(double[] numbers) {

        double[] doubleNumbers = numbers;

        for (int i = 0; i < numbers.length; i = i + 1) {
            doubleNumbers[i] = numbers[i] * 2;
        }

        return doubleNumbers;
    }

    //Display all values in array doubled.
    public static String toDoubleArray(double[] doubleNumbers) {

        String result = ("The array doubled : ");

        for (int i = 0; i < doubleNumbers.length; i = i + 1) {
            result = result + ((doubleNumbers[i] * 2) + ", ");
        }

        return result;
    }

    //Return the lengths of strings in an array.
    public static double[] computeStringLength (String[] words) {
        double[] lengths = new double[words.length];
        int counter = 0;
        for (String word : words) {
            lengths[counter] = word.length();
            counter ++;
        }
        return lengths;
    }

    //Show the length of strings in an array.
    public static String toStringLengthArray(String[] doubleLengths) {

        String result = ("The word array lengths : " );

        for (int i = 0; i < doubleLengths.length; i = i + 1) {
            result = result + (doubleLengths[i].length() + ", ");
        }
        return result;
    }

    //Main method
    public static void main (String[] args) {

        double[] numbers = {15, 32, 67, 44, 98};
        String[] words = {"Here", "You", "go", "again"};

        double average = computeAverage (numbers);
        System.out.println (toArray(numbers));
        System.out.println ();

        double[] doubleNumbers = doubleArray(numbers);

        System.out.println (toDoubleArray(doubleNumbers));
        System.out.println ();
        System.out.println ("The average of the numbers is: " + average);

        double[] lengths = computeStringLength(words);
        System.out.println (toStringLengthArray(words));
    }
}