package com.pack.ifkey;

public class Main {

    public static void main(String[] args) {
        //int highScore = calcscore(true,800,5,100); //calling methods
        //calcscore(false,1500,10,200);

        int highscoreposition = calcHighScorePos(1500);
        diplayHighScorePosition("Nitin",highscoreposition);

        highscoreposition = calcHighScorePos(500);
        diplayHighScorePosition("bob",highscoreposition);

        highscoreposition = calcHighScorePos(102);
        diplayHighScorePosition("cat",highscoreposition);

    }

    public static  void diplayHighScorePosition(String playerName, int highScorePosition ){
        System.out.println(playerName+ " managed to get into position "+highScorePosition+" on the table");
    }
    public static int calcHighScorePos( int playerScore){
       // if(playerScore>= 1000){
         //   return 1;
       // } else if(playerScore >= 500) {
            //return 2;
        //} else if(playerScore >= 100); {
         //   return 3;
       // }
          //  return 4;
        int position = 4; // intial value
        if(playerScore >= 1000){
            position = 1;
        } else if(playerScore >= 500){
            position = 2;
        } else if(playerScore >=100) {
            position = 3;
        }
        return position;

    }
    public static int calcscore(boolean gameOver,int score,int levelCompleted,int bonus){ // using methods

        if (gameOver){
            int finalscore = score + (levelCompleted*bonus);
            finalscore += 1000;
            return finalscore;
        }
        else {
            return -1;
        }

    }
}
