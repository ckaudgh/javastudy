package com.audgh3260.chap08.practice2;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String s = sc.nextLine();
        String[] str = s.toLowerCase().replaceAll("[^a-z ]", "").split(" ");

        String[] uniqueWords = new String[str.length];
        int[] num = new int[str.length];
        int cnt = 0;

        for (String word : str) {
            boolean found = false;
            for (int i = 0; i < cnt; i++) {
                if (uniqueWords[i].equals(word)) {
                    num[i]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueWords[cnt] = word;
                num[cnt] = 1;
                cnt++;
            }
        }

        // 단어 빈도 출력
        System.out.println("===== 단어 빈도 =====");
        for (int i = 0; i < cnt; i++) {
            System.out.println(uniqueWords[i] + ": " + num[i]);
        }

        // 가장 자주 등장하는 단어 찾기
        String mostWord = "";
        int maxCount = 0;
        for (int i = 0; i < cnt; i++) {
            if (num[i] > maxCount) {
                mostWord = uniqueWords[i];
                maxCount = num[i];
            }
        }

        // 결과 출력
        System.out.println("가장 빈도 높은 단어 : " + mostWord + " (" + maxCount + " 번)");
    }
}

