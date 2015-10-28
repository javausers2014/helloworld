import static java.lang.System.out;

interface MathOperation {
    int operation(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World 232233!");
        Main main = new Main();
        final MathOperation addition = (a, b) -> a + b;
        final MathOperation subtraction = (a, b) -> a - b;
        System.out.println(main.operate(1, 2, (a, b) -> a + b));
        System.out.println(main.operate(10, 2, subtraction));
        out.println("this is from output");
        java.util.List<String> lst = new java.util.ArrayList();
        lst.add("test");
        lst.add(null);
        lst.removeIf(java.util.Objects::isNull);
        lst.forEach(out::println);
    }

    private int operate(final int a, final int b, final MathOperation op) {
        return op.operation(a, b);
    }
}
