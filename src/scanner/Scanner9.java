package scanner;

import java.util.Scanner;

public class Scanner9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요.");
        int inputSum = 0;
        int inputCount = 0;
        while (true) {
            int input = sc.nextInt();
            inputSum += input;
            inputCount++;
            if (input == -1) break;
        }
        double inputAverage = (double) inputSum / inputCount;

        System.out.print("입력한 숫자들의 합계: " + inputSum + ", ");
        System.out.println("입력한 숫자들의 평균: " + inputAverage);
    }
}
