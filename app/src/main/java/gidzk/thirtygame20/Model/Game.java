package gidzk.thirtygame20.Model;

import java.util.ArrayList;
import java.util.Observable;

import gidzk.thirtygame20.Model.Dices.Dice;
import gidzk.thirtygame20.Model.Dices.NonRollableDice;
import gidzk.thirtygame20.Model.Dices.RollableDice;


public class Game {
    protected ArrayList<Dice> dices;
    protected Player player;
    protected int round;
    protected int rollIndex;

    private final int maxRound;
    private final int nDices;


    Game(Player player, ArrayList<Dice> dices, int maxRound, int nDices) {
        this.player     = player;
        this.dices      = dices;
        this.round      = 0;
        this.maxRound   = maxRound;
        this.nDices     = nDices;
    }


   public void onRoll(){
       roll();
    }


    public void onLockDice(ArrayList<Integer> indexes){
        lockDices(indexes);

    }





    private void incrRound(){
        round ++;
        clearstoredPlayerDices();
    }

    // will only roll the dices that are set to rollable.
    private void roll() {
        for (Dice d : dices) {
            d.roll();
        }
        rollIndex ++;
    }

    /**
     * will iterate a array of indexes provived by the user to lock and save the dices of the player.
     * @param indexes
     */
    private void lockDices(ArrayList<Integer> indexes) throws IndexOutOfBoundsException  {
        for (Integer i : indexes){
            lockOneDice(i);
        }
    }
    /**
     * adds the Dice to a list, and sets the dice to become unrollable.
     * @param i the index of the dice to be operated.
     */
    private void lockOneDice(int i) throws IndexOutOfBoundsException{
        Dice copy = dices.get(i);
        player.addSavedDice(copy);
        dices.set(i,new NonRollableDice(copy));

    }

    private void incrementRound(){
        round++;

    }

    private void clearstoredPlayerDices(){
        player.clearSavedDices();
    }

    private boolean gameIsOver (){
        return (round >=  maxRound);
    }

    private boolean hasMaxDices(){
        return (player.getStoredDices().size() == nDices);
    }

    private boolean isNonrollable(){

        for (Dice d : dices){

            if(d instanceof RollableDice){
                return false;
            }
        }
        return true;

    }

    private boolean isNextTurn(){

        return ((rollIndex % 3) == 0 ) || hasMaxDices() ;
    }

    public ArrayList<Integer> getFaceValues() {

        ArrayList<Integer> faceVals = new ArrayList<>();
        for (Dice d : dices){
            faceVals.add(d.getFaceVal());
        }

        return faceVals;
    }


}
