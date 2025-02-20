package com.audgh3260.chap05_1.level04;
import java.util.Arrays;

public class Application1 {

    public static void main(String[] args) {
        int[] lotto = new int[6];

        for (int i = 0; i < 6; i++) {
            int num = (int) ((Math.random() * 45) + 1);

            // 중복 체크
            for (int j = 0; j < i; j++) {
                if (lotto[j] == num) {
                    i--; // 중복이 발생하면 현재 인덱스를 다시 반복
                    num = 0;
                    break;
                }
            }

            if (num != 0) {
                lotto[i] = num;
            }
        }
        Arrays.sort(lotto);

        for(int i : lotto){
            System.out.print(i+" ");
        }

    }

}