// another method to count digit [method as in function] 
public class file3 {
    public static void counter(int N) {
        for (int i = 0; i < N + 1; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        counter(5);
    }
}
