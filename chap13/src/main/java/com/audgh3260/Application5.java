package com.audgh3260;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> hset = new LinkedHashSet<>();
        String str;
        while(true){
            System.out.print("단어 입력(exit 입력시 종료) : ");
            str = sc.nextLine();
            if(str.equals("exit")){
                break;
            }
            else {
                hset.add(str);
            }
        }
        TreeSet<String> tset = new TreeSet<>(hset);
        System.out.println("모든 학생의 ID : "+tset);
    }
}
