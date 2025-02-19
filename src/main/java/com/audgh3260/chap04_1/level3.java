package com.audgh3260.chap04_1;
import java.util.Scanner;
public class level3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 연산 수행 기능
        System.out.print("첫 번째 정수 : ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수 : ");
        int num2 = sc.nextInt();

        System.out.print("연산 기호를 입력하세요 (+, -, *, /, %) : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;
            case '%':
                if (num2 != 0) {
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;
            default:
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
                return;
        }

        // 과일 가격 조회 기능
        System.out.print("과일 이름을 입력하세요 (사과, 바나나, 복숭아, 키위) : ");
        String fruit = sc.next();

        switch (fruit) {
            case "사과":
                System.out.println("사과의 가격은 1000원 입니다.");
                break;
            case "바나나":
                System.out.println("바나나의 가격은 3000원 입니다.");
                break;
            case "복숭아":
                System.out.println("복숭아의 가격은 2000원 입니다.");
                break;
            case "키위":
                System.out.println("키위의 가격은 5000원 입니다.");
                break;
            default:
                System.out.println("준비된 상품이 없습니다. 프로그램을 종료합니다.");
                return;
        }
        sc.close();
    }
}
