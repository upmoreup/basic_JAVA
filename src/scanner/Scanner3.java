package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 (첫번째, 두번째 수 모두 0을 입력할 경우 프로그램 종료)");

        while (true) {
            int firstInt = scanner.nextInt();
            int secondInt = scanner.nextInt();
            int sumInt = firstInt + secondInt;
            if (firstInt == 0 && secondInt == 0) {
                break;
            }
            System.out.println("첫번째 입력한 수:" + firstInt);
            System.out.println("두번째 입력한 수:" + secondInt);
            System.out.println("두 수의 합:" + sumInt);
        }
        System.out.println("프로그램을 종료합니다");
    }
}
