package gidzk.thirtygame20.Model;

import java.util.ArrayList;
import java.util.Observable;

import gidzk.thirtygame20.Model.Dices.Dice;
import gidzk.thirtygame20.Model.Dices.RollableDice;


public class Modelapp extends Observable {
    Game model;

    public Modelapp(){
        ArrayList<Dice> dices   = initDices();
        Player player           = new Player("Per",0);
        model = new Game(player,dices,10,6);
    }


    public void onRoll(){
        model.onRoll();
        hasChanged();
        notifyObservers(model);
    }



    public void onLockedDices(ArrayList<Integer> indexes){
        model.onLockDice(indexes);
        hasChanged();
        notifyObservers(model);
    }








    public ArrayList<Integer> getFaceVals(){
        return model.getFaceValues();
    }


    // --------CONSTRUCTOR METHODS ------------
    public static ArrayList<Dice> initDices(){
        ArrayList<Dice> trg = new ArrayList<>();
        for (int i = 0; i < 6 ; i++) {
            trg.add(new RollableDice());
        }

        return trg;
    }






}
