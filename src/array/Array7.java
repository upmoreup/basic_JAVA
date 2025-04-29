package array;

import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] scores = new double[4][2];

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요: ");
            System.out.print("국어 점수: ");
            int koreanScore = sc.nextInt();

            System.out.print("영어 점수: ");
            int englishScore = sc.nextInt();

            System.out.print("수학 점수: ");
            int mathScore = sc.nextInt();

            int sum = koreanScore + englishScore + mathScore;
            double average = (double) sum / 3;
            scores[i][0] = sum;
            scores[i][1] = average;
        }

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 총점: " + scores[i][0] + ", " + "평균: " + scores[i][1]);
        }
    }
}
