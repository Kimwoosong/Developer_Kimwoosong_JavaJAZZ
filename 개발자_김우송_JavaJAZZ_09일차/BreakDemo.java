public class BreakDemo {
    public static void main(String[] args) {
        int i = 1, j = 10;

        while (true) {
            System.out.println(i++);
            if (i >= j)
                break;
        }
    }
}
