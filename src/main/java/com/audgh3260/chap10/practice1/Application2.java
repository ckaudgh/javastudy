package com.audgh3260.chap10.practice1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
        String input = scanner.nextLine();

        try {
            // 입력된 문자열을 LocalDate로 변환
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate birthDate = LocalDate.parse(input, formatter);
            LocalDate today = LocalDate.now();

            // 나이 계산
            int age = Period.between(birthDate, today).getYears();

            // 20세 미만 검사
            if (age < 20) {
                throw new InvalidAgeException("만 20세 미만은 입장 불가입니다.");
            }
            System.out.println("입장하셔도 됩니다.");
        } catch (DateTimeParseException e) {
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}