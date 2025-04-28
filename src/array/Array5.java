package array;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요");

        int totalCountNumber = sc.nextInt();
        int[] numbers = new int[totalCountNumber];
        int sum = 0;

        System.out.println(totalCountNumber + "개의 정수를 입력하세요");
        for (int i = 0; i < numbers.length; i++) {
            int inputNumber = sc.nextInt();

            sum += inputNumber;
        }

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + sum / totalCountNumber);
    }
}
