package com.audgh3260.chap05_2.level03;
import java.util.Random;
import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;

        // 가로 행 입력
        while (true) {
            System.out.print("가로 행의 수를 입력하세요 (1~10): ");
            rows = sc.nextInt();
            if (rows >= 1 && rows <= 10) break;
            System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
        }

        // 세로 열 입력
        while (true) {
            System.out.print("세로 열의 수를 입력하세요 (1~10): ");
            cols = sc.nextInt();
            if (cols >= 1 && cols <= 10) break;
            System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
        }

        char[][] grid = new char[rows][cols];

        // 랜덤 대문자 할당
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = (char) ('A' + (int) (Math.random() * 25)+1);
            }
        }

        // 출력
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
        /* 가로와 세로 길이를 정수형으로 입력 받아
         * 입력받은 가로 세로 길이를 이용하여 이차원 배열을 할당하고
         * 각 인덱스에는 랜덤으로 알파벳 대문자 넣어서 출력
         *
         * 단, 가로 행 혹은 세로 열은 반드시 1~10 까지의 정수를 입력해야 하고
         * 그렇지 않은 경우에는 "반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요." 출력 후
         * 가로 행 또는 세로 열을 다시 입력받을 수 있도록 한다.
         *
         * -- 입력 예시 --
         * 가로 행의 수를 입력하세요 : 5
         * 세로 열의 수를 입력하세요 : 4
         *
         * -- 출력 예시 --
         * F H Z G
         * W F O T
         * O R X V
         * W H J X
         * W S S J
         * */

    }

}