package com.danicadale.boodles;



public class Treato {

    private final int treatNum;
    private final String treatDispensed;



    public Treato(int treatNum, String treatDispensed) {

        this.treatNum = treatNum;
        this.treatDispensed = treatDispensed;
    }



    public String getTreatDispensed() {

        return treatDispensed;
    }



    public int getTreatNum() {

        return treatNum;
    }
}
