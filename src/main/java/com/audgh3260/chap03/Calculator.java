package com.audgh3260.ex.chap03;

public class Calculator {
    public void methodA(){
        System.out.println("메소드 호출 확인");
    }
    public int sum() {
        int result=0;
        for(int i = 1; i <= 10; i++) {
            result += i;
        }
        return result;
    }
    public int minus(int a, int b) {
        return a-b;
    }
}
