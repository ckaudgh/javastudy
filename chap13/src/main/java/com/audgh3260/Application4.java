package com.audgh3260;

import java.util.HashSet;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hset = new HashSet<>();
        String ID;
        while(true){
            System.out.print("학생 ID 입력(exit 입력시 종료) : ");
            ID = sc.nextLine();
            if(ID.equals("exit")){
                break;
            }
            else {
                hset.add(ID);
            }
        }
        System.out.println("모든 학생의 ID : "+hset);
    }
}
