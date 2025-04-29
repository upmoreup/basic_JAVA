package method;

public class OverLoading1 {
    public static void main(String[] args) {
        System.out.println(add(3, 4));
        System.out.println(add(7, 100));
        System.out.println(add(5, 6, 7));
        System.out.println(add(100, 99, 98));

        System.out.println(add(10, 99.5));
        System.out.println(add(100.9, 99, 98.3));
    }

    // 메서드명 같지만 Param이 다른 경우 => 메서드 오버로딩
    private static int add(int a, int b) {
        return a + b;
    }

    private static int add(int a, int b, int c) {
        return a + b + c;
    }

    private static double add(int a, double b) {
        return a + b;
    }

    private static double add(double a, int b, double c) {
        return a + b + c;
    }
}
