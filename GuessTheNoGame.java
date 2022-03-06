package com.company;
import java.util.Scanner;
import java.util.Random;

class Game{
    public int no, userinput,count = 0;

    public int getNoOfGuesses() {
        return count;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.count = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.no = rand.nextInt(100);
    }
    void UserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        userinput = sc.nextInt();
    }
    boolean FindCorrectNo(){
        count++;
        if(count>10)
        {
            System.out.format("You have reached the limit\nTry again !!");
            return true;
        }
        else if (userinput==no){
            int score=10-count;
            System.out.format("\nYes you guessed the right number !! \nit was %d\nYou guessed it in %d attempts\nand Your Score =%d", no, count,score);
           if(score>1 && score<4)
           {
               System.out.println(" (Good)");
           }
           else if(score>=4 && score<=6)
           {
               System.out.println(" (Average)");
           }
           else if(score>=7)
           {
               System.out.println(" (Excellent)");
           }
            return true;
        }
        else if(userinput<no){
            System.out.println("Too low...");
        }
        else if(userinput>no){
            System.out.println("Too high...");
        }
        return false;
    }

}
public class GuessTheNoGame {
    public static void main(String[] args) {
        Game g=new Game();
        boolean b=false;
        while(!b)
        {
            g.UserInput();
            b=g.FindCorrectNo();
        }
    }
}


