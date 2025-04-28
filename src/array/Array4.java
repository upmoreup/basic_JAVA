package array;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        StringBuilder totalString = new StringBuilder();
        for (int i = numbers.length - 1; i >= 0; i--) {
            totalString.append(numbers[i]);

            if (i != 0) {
                totalString.append(", ");
            }

        }

        System.out.println("출력");
        System.out.println(totalString);
    }
}
