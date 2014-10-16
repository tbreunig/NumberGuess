package controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Tyler
 */
@Named
@SessionScoped
public class NumberGuessBean implements Serializable {

    private int randNum = 12;
    private int guess;
    private String finalMessage;

    public String checkGuess() {
        if (guess == randNum) {
            finalMessage = "Nice guess!";
        } else {
            finalMessage = "Oop! Wrong. Try again!";
        }
        return null;
    }

    public int getRandNum() {
        return randNum;
    }

    public void setRandNum(int randNum) {
        this.randNum = randNum;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public String getFinalMessage() {
        return finalMessage;
    }

    public void setFinalMessage(String finalMessage) {
        this.finalMessage = finalMessage;
    }

    
    
}
