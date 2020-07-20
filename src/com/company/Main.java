package com.company;

import com.company.controller.ScoreBoard;
import com.company.model.Balloon;
import com.company.model.Clown;
import com.company.model.SquareBalloon;


public class Main {
    public static void main(String[] args){
        ScoreBoard scoreBoard=new ScoreBoard();

        System.out.print("balloon Tap Score");
        scoreBoard.algorithmBase=new Balloon();
        scoreBoard.showScore(10, 5);

        System.out.print("Clown tap Score");
        scoreBoard.algorithmBase=new Clown();
        scoreBoard.showScore(10, 5);


        System.out.print("SquareBalloon score:");
        scoreBoard.algorithmBase=new SquareBalloon();
        scoreBoard.showScore(10, 5);


    }

}
