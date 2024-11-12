package Methods;  // In java the functions are called "Methods" because if we write the functions in class its called methods.

public class basic {
    public static void main(String[] args) {
        String result = greeting();
        System.out.println(result);
    }

    static String greeting() {
        String greeting = "How are you?";
        return greeting;
    }
}
