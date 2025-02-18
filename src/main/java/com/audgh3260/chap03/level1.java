package com.audgh3260.ex.chap03;

public class level1 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int a = 10, b = 20;
        //메소드 호출 확인용 메소드 호출
        cal.methodA();
        //함수를 호출하여 1~10까지의 합을 리턴 받아 출력
        System.out.println(cal.sum());
        //10, 20 두 개의 정수를 매개변수로 하여 큰 값 출력하는 메소드 호출
        System.out.println(Math.max(a,b));
        //10, 20 두 개의 정수를 매개변수로 하여 두 수를 더하는 메소드 호출 후 리턴값 출력
        System.out.println(Math.min(a,b));
        //10, 5 두 개의 정수를 매개변수로 하여 두 수의 차를 구하는 메소드 호출 후 리턴값 출력
        System.out.println(cal.minus(10,5));

    }
}

