package scanner;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요: ");
        String userName = sc.nextLine();

        System.out.print("당신의 나이를 입력하세요: ");
        int userAge = sc.nextInt();

        System.out.println("당신의 이름은 " + userName + "이고, 나이는 " + userAge + "입니다.");
    }
}
