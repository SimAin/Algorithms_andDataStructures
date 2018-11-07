public class Average {
    private int i;

    public static double findSum (double[] numbers) {
        double sum = 0.0;

        for (int i = 0; i < numbers.length; i = i + 1) {
            sum = sum + numbers[i];
        }

        return sum;
    }

    public static double computeAverage (double[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        } else {
            double sum = findSum (numbers);

            return sum/numbers.length;
        }
    }

    public static void showArray(double[] numbers) {

        System.out.print ("The array: " );

        for (int i = 0; i < numbers.length; i = i + 1) {
            System.out.print (numbers[i] + ", ");
        }
    }

    public static double[] doubleArray(double[] numbers) {

        double[] doubleNumbers = numbers;

        for (int i = 0; i < numbers.length; i = i + 1) {
            doubleNumbers[i] = numbers[i] * 2;
        }

        return doubleNumbers;
    }

    public static void showDoubleArray(double[] doubleNumbers) {

        System.out.print ("The array doubled : " );

        for (int i = 0; i < doubleNumbers.length; i = i + 1) {
            System.out.print (doubleNumbers[i] + ", ");
        }
    }

    public static double[] computeStringLength (String[] words) {
        double[] lengths = new double[words.length];
        int counter = 0;
        for (String word : words) {
            lengths[counter] = word.length();
            counter ++;
        }
        return lengths;
    }

    public static void showStringLengthArray(double[] doubleLengths) {

        System.out.print ("The word array lengths : " );

        for (int i = 0; i < doubleLengths.length; i = i + 1) {
            System.out.print (doubleLengths[i] + ", ");
        }
    }

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