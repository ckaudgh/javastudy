package com.audgh3260.chap06.practice1;

public class Application {
    public static void main(String[] args) {
        BookDTO book = new BookDTO();
        book.printInfo();
        BookDTO book2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        book2.printInfo();
        BookDTO book3 = new BookDTO("홍길동전","활빈당","허균",5000000,0.5);
        book3.printInfo();
    }


}
