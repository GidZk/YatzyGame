package gidzk.thirtygame20.Model;

import java.util.ArrayList;
import java.util.Arrays;

import gidzk.thirtygame20.Model.Dices.Dice;
import gidzk.thirtygame20.Model.Dices.RollableDice;



public  class ModelTest {

    public static void main (String [] args){

        Modelapp gameModel = new Modelapp();
        modelRollTest(gameModel);


    }


    // ok tested if they change status.
    public static void modelRollTest(Modelapp model){
        model.onRoll();
        printFaceVals(model.getFaceVals());

        model.model.getDice1().setSelected();
        model.model.getDice2().setSelected();
        model.model.getDice3().setSelected();

        model.onLock();
        model.onRoll();
        printFaceVals(model.getFaceVals());



    }


    public static void printFaceVals(ArrayList<Integer> faceVals){
        System.out.println(Arrays.toString(faceVals.toArray()));

    }



    public static void testDice(){
        Dice dice = new RollableDice();

        for (int i = 0; i < 10 ; i++) {
        dice.roll();
        System.out.println();
    }

}


    public static ArrayList<Dice> initDices(){
        ArrayList<Dice> trg = new ArrayList<>();
        for (int i = 0; i < 6 ; i++) {
            trg.add(new RollableDice());
        }

        return trg;
    }



}
