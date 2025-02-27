package com.audgh3260;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        Queue<String> url = new LinkedList<>();

        while(true) {

            System.out.print("방분 URL을 입력(exit 입력시 종료) : ");
            str = sc.nextLine();
            if("exit".equals(str)) {
                break;
            }
            url.offer(str);
            if(url.size() > 5){
                url.poll();
            }
            System.out.println("최근 방문 url : "+url);

        }
    }
}
