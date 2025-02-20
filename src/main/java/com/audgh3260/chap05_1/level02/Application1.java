package com.audgh3260.chap05_1.level02;
import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 하나를 입력 : ");
        String str = sc.nextLine();
        System.out.print("검색할 문자 입력 : ");
        char search = sc.next().charAt(0);

        char[] ch = str.toCharArray();
        int count = 0;

        for (int i = 0; i < str.length()-1; i++) {
            if(ch[i] == search) {
                count ++;
            }
        }
        System.out.println("문자열 "+str+"에서 찾으시는 문자 "+search+"은(는) "+count+"개 입니다.");

        /*
         * 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
         * (String Class의 toCharArray() : char[] 메소드 활용 가능
         * char[] carr = 문자열변수.toCharArray(); 와 같이 사용)
         * 검색할 문자를 하나 입력 받아 입력 받은 검색할 문자가
         * 문자열에 몇개 있는지를 출력하세요
         *
         * -- 입력 예시 --
         * 문자열을 하나 입력하세요 : helloworld
         * 검색할 문자를 입력하세요 : l
         *
         * -- 출력 예시 --
         * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
         */

    }

}