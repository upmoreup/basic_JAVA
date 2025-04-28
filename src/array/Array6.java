package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요");

        int totalCountNumber = sc.nextInt();
        int[] numbers = new int[totalCountNumber];

        System.out.println(totalCountNumber + "개의 정수를 입력하세요");
        for (int i = 0; i < numbers.length; i++) {
            int inputNumber = sc.nextInt();

            numbers[i] = inputNumber;
        }

        System.out.println("가장 작은 정수: " + Arrays.stream(numbers).min().orElse(Integer.MIN_VALUE));
        System.out.println("가장 큰 정수 : " + Arrays.stream(numbers).max().orElse(Integer.MAX_VALUE));
    }
}
