package com.company.model;

import com.company.controller.ScoreAlgorithmBase;

public class Clown extends ScoreAlgorithmBase{

    @Override
    public int calculateScore(int taps, int multiplier){
        return (taps*multiplier)-10;
    }
}
