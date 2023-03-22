package Array;
public class BasicOfArray {
    public static void main(String[] args) {

        String[] arr2 = { "hello", "this is string", "hello", "this is string" };
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i].length() != 5) {
                System.out.println(arr2[i]);
            }

        }
    }
}
