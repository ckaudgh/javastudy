package com.audgh3260.chap08.practice2;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String s : strs) {
                result.append(Character.toUpperCase(s.charAt(0)))
                        .append(s.substring(1).toLowerCase())
                        .append(" ");
        }
        System.out.println(result);
        System.out.println(strs.length);

    }
}