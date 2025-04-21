package scanner;

import java.util.Scanner;

public class Scanner7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String userName = sc.nextLine();

            if (userName.equals("종료")) {
                System.out.print("프로그램이 종료되었습니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int userAge = sc.nextInt();
            sc.nextLine();

            System.out.println("입력한 이름: " + userName + ", 나이: " + userAge);
        }
    }
}
