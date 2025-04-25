package array;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers;
        numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요:");

        StringBuilder totalString = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            int inputNumber = sc.nextInt();

            if (i == numbers.length - 1) {
                totalString.append(inputNumber);
            } else {
                totalString.append(inputNumber).append(", ");
            }

        }

        System.out.println("출력");
        System.out.println(totalString);
    }
}
