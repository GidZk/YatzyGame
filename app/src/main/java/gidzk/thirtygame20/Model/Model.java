package gidzk.thirtygame20.Model;

import java.util.ArrayList;
import java.util.Observable;

import gidzk.thirtygame20.Model.Dices.Dice;
import gidzk.thirtygame20.Model.Dices.NonRollableDice;
import gidzk.thirtygame20.Model.Dices.RollableDice;


public class Model {
    protected ArrayList<Dice> dices;
    protected Player player;
    protected int round;
    protected int rollIndex;

    private final int maxRound;
    private final int nDices;


    Model(Player player, ArrayList<Dice> dices, int maxRound, int nDices) {
        this.player     = player;
        this.dices      = dices;
        this.round      = 0;
        this.maxRound   = maxRound;
        this.nDices     = nDices;
    }


    protected void roll() {
        for (Dice d : dices) {
            d.roll();

        }
        rollIndex ++;
    }

    /**
     * sets the dices to unrollable dices
     */
    protected void lockDices(){
        lockDicesHelper();

    }


    /**
     * Iterates through the Array of dices, and sets the one set as selected to become unrollable.
     */
    protected void lockDicesHelper(){
        int i = 0;
        for(Dice d : dices){
            if(d.isSelected()){
                player.addSavedDice(d);
                dices.set(i,new NonRollableDice(d));
            }

            i++;
        }
    }

    private void incrRound(){
        round ++;
        clearstoredPlayerDices();
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

    public Dice getDice1(){
        return dices.get(0);
    }

    public Dice getDice2(){
        return dices.get(1);
    }

    public Dice getDice3(){
        return dices.get(2);
    }

    public Dice getDice4(){
        return dices.get(3);
    }

    public  Dice getDice5(){
        return dices.get(4);
    }

    public Dice getDice6(){
        return dices.get(5);
    }











// ============== WORTHLESS SHIT ==================
    /**
     * will iterate a array of indexes provived by the user to lock and save the dices of the player
     * will also set the nonrollabledice boolean value, rollable to false.
     * @param indexes
     */
    protected void lockDicesHelperold(ArrayList<Integer> indexes) throws IndexOutOfBoundsException  {

        for (Integer i : indexes){
            lockOneDiceold(i);
        }
    }
    private void lockOneDiceold(int i) throws IndexOutOfBoundsException{
        Dice copy = dices.get(i);
        player.addSavedDice(copy);
        dices.set(i,new NonRollableDice(copy));

    }
}
