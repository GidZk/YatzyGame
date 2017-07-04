package gidzk.thirtygame20.Model.Dices;

import java.util.Random;


public abstract class Dice {
    protected Random rand;
    protected int faceVal;
    protected boolean rollable;

    Dice(){
        this.rand = new Random ();
        this.faceVal = rand.nextInt(6) +1;

    }


    //Copy constructor
    Dice (Dice copy){
        this.rand = copy.rand;
        this.faceVal = copy.getFaceVal();
    }

    public abstract void roll();

    public int getFaceVal() {
        return faceVal;
    }



}
