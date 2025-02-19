package com.audgh3260.chap04_1;

import java.util.Scanner;

public class level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1~10 사이의 숫자를 입력하세요 : ");
        int a = sc.nextInt();
        String str = "반드시 1~10 사이의 정수를 입력해야 합니다.";
        if (a > 0 && a < 11) {
            str = (a%2==0)?"짝수다.":"홀수다.";
        }
        System.out.println(str);

        System.out.print("체중(kg)과 신장(m)을 입력하세요");
        double kg = sc.nextDouble();
        double m = sc.nextDouble();

        double bmi = kg / (m*m);

        if (bmi < 20) {
            str = "저체중";
        }
        else if (bmi >= 20 && bmi < 25) {
            str = "정상체중";
        }
        else if (bmi >= 25 && bmi < 30) {
            str = " 과체중";
        }
        else str = "비만";
        System.out.println(bmi);
        System.out.println(str);

        sc.close();
    }
}
