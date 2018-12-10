import mylib.example2;
public class example {

    public static void main (String[] args){
        hello();

        mylib.example.hello();

        example2.hello();
    }

    public static void hello () {
        System.out.println ("Hello from Example");
    }
}
