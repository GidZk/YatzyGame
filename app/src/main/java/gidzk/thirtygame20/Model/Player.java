package gidzk.thirtygame20.Model;

import java.util.ArrayList;

import gidzk.thirtygame20.Model.Dices.Dice;
import gidzk.thirtygame20.Model.Dices.NonRollableDice;
import gidzk.thirtygame20.Model.Scorehandler.ScoreHandler;


public class Player {
    private String name;
    protected ScoreHandler scorehandler;
    private ArrayList<Dice> storedDices;


    Player(String name, int score){
        this.name = name;
        this.scorehandler = new ScoreHandler();
        storedDices = new ArrayList<>();
    }



    // used at the end of round.
    public void clearSavedDices(){
        storedDices.clear();
    }


    /**
     * will create a defensive copy of the dice, and store it in the Array of current player
     * @param d dice to be cloned
     */
    public void addSavedDice(Dice d){
        Dice defensiveClone  = new NonRollableDice(d);
        storedDices.add(defensiveClone);
    }

    public String getPlayerName() {
        return name;
    }

    public ArrayList<Dice> getStoredDices() {
        return storedDices;
    }

    public ScoreHandler getScorehandler() {
        return scorehandler;
    }

}
