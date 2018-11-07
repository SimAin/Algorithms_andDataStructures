public class SearchingTests {

    public static void searchTests(){
        int[] numbers = {1,2,3,4,5,6};
        int find = 45;
        int result = Searching.findNumber(numbers, find);

        if(result != -1){
            System.out.println("Error: was found despite not in list.");
        }

        int[] numbers2 = {1,2,3,4,5,6};
        int find2 = 5;
        int result2 = Searching.findNumber(numbers2, find2);

        if(result2 == -1){
            System.out.println("Error: was NOT found despite in list.");
        }

        int[] numbers3 = {};
        int find3 = 45;
        int result3 = Searching.findNumber(numbers3, find3);

        if(result3 != -1){
            System.out.println("Error: was found despite not in list. ");
        }
    }

    public static void binarySearchTests(){
        int[] numbers = {1,2,3,4,5,6};
        int find = 45;
        int result = Searching.binarySearch(numbers, find);

        if(result != -1){
            System.out.println("Error: was found despite not in list.");
        }

        int[] numbers2 = {1,2,3,4,5,6};
        int find2 = 5;
        int result2 = Searching.binarySearch(numbers2, find2);

        if(result2 == -1){
            System.out.println("Error: was NOT found despite in list.");
        }

        int[] numbers3 = {};
        int find3 = 45;
        int result3 = Searching.binarySearch(numbers3, find3);

        if(result3 != -1){
            System.out.println("Error: was found despite not in list. ");
        }

        int[] numbers4 = {4, 56, 7, 12, 56, 33, 2};
        int find4 = 56;
        int result4 = Searching.binarySearch(numbers4, find4);

        if(result4 == -1){
            System.out.println("Error: was found despite not in list. ");
        }
    }

    public static void main (String[] args) {

        searchTests();
        binarySearchTests();
    }
}
