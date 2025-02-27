package com.audgh3260;

import java.util.ArrayList;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        ArrayList<Integer> score = new ArrayList<>();
        char ch='y';
        int num = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            if (ch == 'y'||ch == 'Y') {
                System.out.print("학생 성적 : ");
                score.add(sc.nextInt());
                System.out.print("추가 입력하려면 y : ");
                ch = sc.next().charAt(0);
            }
            else {
                System.out.println("학생 인원 : "+score.size());
                num = score.size();
                break;
            }
        }
        int sum = 0;
        for(int i = 0; i < score.size(); i++) {
            sum += score.get(i);
        }
        System.out.println("평균 점수 : " + (double)sum/num);
    }
}
