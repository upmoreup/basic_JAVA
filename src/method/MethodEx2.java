package method;

import java.util.Scanner;

public class MethodEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bankAmount = 0;

        while (true) {
            System.out.println("원하시는 메뉴 번호를 입력해주세요. 1: 입금, 2: 출금, 3: 잔액확인, 4: 종료");
            String menuNumber = sc.nextLine();

            switch (menuNumber) {
                case "1":
                    System.out.print("입금액을 입력하세요: ");
                    int depositAmount = sc.nextInt();

                    bankAmount = calculate(bankAmount, depositAmount);
                    System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + bankAmount + "원");
                    sc.nextLine(); // 버퍼 비우기
                    break;
                case "2":
                    System.out.print("출금액을 입력하세요: ");
                    int withdrawAmount = sc.nextInt();

                    if (bankAmount < withdrawAmount) {
                        System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
                    } else {
                        bankAmount = calculate(bankAmount, withdrawAmount * -1);
                        System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + bankAmount + "원");
                        sc.nextLine(); // 버퍼 비우기
                    }
                    break;
                case "3":
                    System.out.println("현재 잔액: " + bankAmount);
                    break;
                case "4":
                    System.out.print("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 메뉴 번호를 입력해주세요.");
                    break;
            }
        }
    }

    private static int calculate(int total, int change) {
        return total + change;
    }
}
