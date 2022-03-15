package com.company;

public class Class {
    private int bSan;
    private String word;
    private int[] array;

    public Class(int bSan, String word, int[] array){
        this.bSan = bSan;
        this.word = word;
        this.array = array;
    }
    int getbSan(){
        return bSan;
    }
    String getWord(){
        return word;
    }
    int[] getArray(){
        return array;
    }
}
