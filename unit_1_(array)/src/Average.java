//A class with series of methods to manage a double array.
public class Average {
    private int i;

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
    public static void showArray(double[] numbers) {

        System.out.print ("The array: " );

        for (int i = 0; i < numbers.length; i = i + 1) {
            System.out.print (numbers[i] + ", ");
        }
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
    public static void showDoubleArray(double[] doubleNumbers) {

        System.out.print ("The array doubled : " );

        for (int i = 0; i < doubleNumbers.length; i = i + 1) {
            System.out.print (doubleNumbers[i] + ", ");
        }
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
    public static void showStringLengthArray(double[] doubleLengths) {

        System.out.print ("The word array lengths : " );

        for (int i = 0; i < doubleLengths.length; i = i + 1) {
            System.out.print (doubleLengths[i] + ", ");
        }
    }

    //Main method
    //TODO: poke all internal methods and demo expected result.
    public static void main (String[] args) {

        double[] numbers = {15, 32, 67, 44, 98};
        String[] words = {"Here", "You", "go", "again"};

        //double[] numbers = {};

        double average = computeAverage (numbers);
        showArray(numbers);
        System.out.println ();

        double[] doubleNumbers = doubleArray(numbers);
        
        showDoubleArray(doubleNumbers);
        System.out.println ();
        System.out.println ("The average of the numbers is: " + average);

        double[] lengths = computeStringLength(words);
        showStringLengthArray(lengths);
    }
}