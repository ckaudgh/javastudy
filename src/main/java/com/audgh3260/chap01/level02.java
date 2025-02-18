package com.audgh3260.ex.chap01;

public class level02 {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println("문자 " + ch + "의 unicode : " + (int)ch);

        double kor = 80.5, mat = 50.6, eng = 70.8;
        System.out.println("총점 : " + (int)(kor + mat + eng));
        System.out.println("평균 : " + (int)(kor + mat + eng)/3);
    }
}
