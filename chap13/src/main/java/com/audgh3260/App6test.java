package com.audgh3260;

import java.util.HashMap;
import java.util.Scanner;

public class App6test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, search;
        HashMap<String,String> map = new HashMap<>();
        while(true){
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 search, 종료는 exit) : ");
            str = sc.nextLine();
            String[] strs = str.split(" ");
            if(str.equals("exit")) break;
            else if(str.equals("search")){
                System.out.print("검색 할 이름 : ");
                search = sc.nextLine();
                if (map.containsKey(search)) {
                    System.out.println(search + "씨의 전화번호 : " + map.get(search));
                } else {
                    System.out.println(search + "씨의 번호는 등록 되어 있지 않습니다.");
                }
            }
            else{
                map.put(strs[0], strs[1]);
                System.out.println("추가 완료 : " + strs[0] +" "+ strs[1]);
            }
        }
    }
}
