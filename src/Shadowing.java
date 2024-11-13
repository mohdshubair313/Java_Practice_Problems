package Methods;

public class Shadowing {
    static int x = 90;  // yaha par x = 90 hai par when this x is re-initialize x in main method this x which is global whoever can used method it but it shadowed means chup gaya jab dusri baar initialize hua in main method
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;  // the class variable at line 4 is shodowed by this variable
        System.out.println(x);
        fun();
    }

    private static void fun() {
        System.out.println(x);
    }
}
