package com.audgh3260.chap04_2;
import java.util.Scanner;
public class level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();
        char[] ch = new char[str.length()];
        for(int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        for(int i = 0; i < ch.length; i++) {
            System.out.println("" + i + ":" + ch[i]);
        }
        String str2 = "";
        for(char i = 'a'; i <= 'z'; i++) {
            str2 += i;
        }
        System.out.println(str2);

        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        sc.close();
        String str3 = "";
        for(int i = 1; i <= num; i++) {
            str3 += (i%2==0)?"박":"수";
        }
        System.out.println(str3);
    }
}
