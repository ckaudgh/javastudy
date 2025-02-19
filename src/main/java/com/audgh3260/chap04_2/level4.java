package com.audgh3260.chap04_2;
import java.util.Scanner;

public class level4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자 입력 받기
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        System.out.print("숫자를 입력하세요 : ");
        int shift = sc.nextInt();
        sc.close();

        // 알파벳 개수(26)로 나눠서 실제 이동할 거리 계산
        shift = shift % 26;

        String result = translate(str, shift);
        System.out.println("암호화된 문자열 : " + result);
    }

    public static String translate(String text, int shift) {
        String code = "";

        for (char c : text.toCharArray()) {
            // 공백은 그대로 유지
            if (c == ' ') {
                code += ' ';
                continue;
            }

            char base = Character.isUpperCase(c) ? 'A' : 'a';
            char newChar = (char) (base + (c - base + shift));
            code += newChar;
        }

        return code;
    }
}
