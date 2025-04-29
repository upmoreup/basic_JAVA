package array;

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Object[][] products = new Object[10][2];

        int limitCount = 0;
        while (true) {
            if (limitCount == 10) {
                System.out.print("최대 상품 등록 개수는 10개입니다. 프로그램을 종료합니다.");
                printProductsList(products);
                return;
            }

            System.out.println("원하시는 메뉴 번호를 입력해주세요. 1: 상품 등록, 2: 상품 목록, 3: 종료");
            String menuNumber = sc.nextLine();

            switch (menuNumber) {
                case "1":
                    System.out.print("상품 이름을 입력하세요: ");
                    String productName = sc.next();

                    int productPrice;
                    while (true) {
                        System.out.print("상품 가격을 입력하세요(숫자만 입력): ");
                        if (sc.hasNextInt()) {
                            productPrice = sc.nextInt();
                            break;
                        } else {
                            System.out.println("잘못된 입력입니다. 숫자만 입력하세요.");
                            sc.next(); // 잘못 입력한 값 버리기
                        }
                    }
                    sc.nextLine(); // 버퍼 비우기

                    products[limitCount][0] = productName;
                    products[limitCount][1] = productPrice;
                    break;
                case "2":
                    printProductsList(products);
                    return;
                case "3":
                    printProductsList(products);
                    System.out.print("프로그램이 종료되었습니다.");
                    return;
                default:
                    System.out.println("올바른 메뉴 번호를 입력해주세요.");
                    limitCount--;
                    break;
            }

            limitCount++;
        }
    }

    private static void printProductsList(Object[][] products) {
        if (products[0][0] == null) {
            System.out.print("등록된 상품이 없습니다");
            return;
        }

        for (int i = 0; i < products.length; i++) {
            if (products[i][0] == null) {
                break;
            }
            System.out.println((i + 1) + "번 상품명: " + products[i][0] + ", " + (i + 1) + "번 상품 가격: " + products[i][1]);
        }
    }
}
