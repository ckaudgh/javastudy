package com.audgh3260.ex.chap03;

public class level2 {
    public static void main(String[] args) {
        RandomMarker rand = new RandomMarker();
        System.out.println(rand.randomNumber(-10,20));
        System.out.println(rand.randomUpperAlphabet(5));
        System.out.println(rand.rockPaperScissors());
        System.out.println(rand.tossCoin());

    }
}
