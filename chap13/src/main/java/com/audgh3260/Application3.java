package com.audgh3260;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        Queue<String> name = new LinkedList<>();
        while(true){
            System.out.print("대기 고객 이름 입력(다음 고객으로 넘어가려면 'next', 종료하려면 'exit' : ");
            str = sc.nextLine();
            if("exit".equals(str)) {
                break;
            }
            else if("next".equals(str)) {
                if(name.isEmpty()){
                    System.out.println("대기 고객이 없습니다.");
                }
                else System.out.println(name.poll()+" 고객님 차례입니다.");
            }
            else {
                name.offer(str);
                System.out.println(str+" 고객님 대기 등록");

            }
        }
    }
}
