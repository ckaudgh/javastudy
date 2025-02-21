package com.audgh3260.chap06.practice2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO[] dto = new StudentDTO[10];
        String name;
        int i = 0;
        char choice;
        while(i<10){
            dto[i] = new StudentDTO();
            System.out.print("학년 : ");
            dto[i].setGrade(sc.nextInt());
            System.out.print("반 : ");
            dto[i].setClassroom(sc.nextInt());
            System.out.print("이름 : ");
            sc.nextLine();
            dto[i].setName(sc.nextLine());
            System.out.print("국어 점수 : ");
            dto[i].setKor(sc.nextInt());
            System.out.print("영어 점수 : ");
            dto[i].setEng(sc.nextInt());
            System.out.print("수학 점수 : ");
            dto[i].setMath(sc.nextInt());
            System.out.print("계속 추가할 겁니까 ? (y/n) : ");
            choice = sc.next().charAt(0);
            if(choice=='y'){
                i++;
            }

            else{
                i++;
                break;
            }
        }
        for(int j = 0; j < i; j++){
            dto[j].printInformation();
        }
    }
}
