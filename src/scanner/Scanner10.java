package scanner;

import java.util.Scanner;

public class Scanner10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalAmount = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int selectOption = sc.nextInt();

            if (selectOption == 1) {
                sc.nextLine();

                System.out.print("상품명을 입력하세요: ");
                String productName = sc.next();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = sc.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = sc.nextInt();

                totalAmount = price * quantity;

                System.out.println("상품명: " + productName + " 가격: " + price + " 수량: " + quantity + " 합계: " + totalAmount);
            } else if (selectOption == 2) {
                System.out.print("총 비용: " + totalAmount);
                break;
            } else if (selectOption == 3) {
                System.out.print("프로그램이 종료되었습니다.");
                break;
            } else {
                System.out.print("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
