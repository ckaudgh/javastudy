package com.audgh3260.ex.chap03;

public class RandomMarker {
    public int randomNumber(int a, int b) {
        return (int)(Math.random()*(b-a+1))+a;
    }
    public String randomUpperAlphabet(int a){
        //65 - 90
        String r = "";
        for(int i = 0; i < a; i++){
             char ch = (char)((Math.random()*(90-65+1))+65);
             r += ch;
        }
        return r;
    }
    public String rockPaperScissors(){
        int num = (int)(Math.random()*3)+1;
        if(num == 1){
            return "rock";
        }
        else if(num == 2){
            return "scissors";
        }
        else{
            return "paper";
        }
    }
    public String tossCoin(){
        int num = (int)(Math.random()*2)+1;
        if(num == 1){
            return "앞면";
        }
        else{
            return "뒷면";
        }
    }
}
