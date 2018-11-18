public class testCompareTo {

    public static void main (String[] args){
        int result_ab = "a".compareTo ("b");
        int result_ba = "b".compareTo ("a");
        int result_aaaaab ="aaa".compareTo ("aab");
        int result_aa ="a".compareTo ("a");

        System.out.println("Result of a v b: " + result_ab);
        System.out.println("Result of b v a: " + result_ba);
        System.out.println("Result of aaa v aab: " + result_aaaaab);
        System.out.println("Result of a v a: " + result_aa);

        Integer one = 1;
        Integer two = 2;
        int result_12 = one.compareTo(two);

        System.out.println("Result of 1 v 2: " + result_12);

    }
}
