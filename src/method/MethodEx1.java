package method;

public class MethodEx1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("평균값: " + add(a, b, c));

        int x = 15;
        int y = 25;
        int z = 35;

        System.out.println("평균값: " + add(x, y, z));
    }

    private static double add(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }
}
