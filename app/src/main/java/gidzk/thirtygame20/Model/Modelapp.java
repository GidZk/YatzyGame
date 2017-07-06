package gidzk.thirtygame20.Model;

import java.util.ArrayList;
import java.util.Observable;

import gidzk.thirtygame20.Model.Dices.Dice;
import gidzk.thirtygame20.Model.Dices.RollableDice;


public class Modelapp extends Observable {
    Model model;

    public Modelapp(){
        ArrayList<Dice> dices   = initDices();
        Player player           = new Player("Per",0);
        model = new Model(player,dices,10,6);
    }


    public void onRoll(){
        model.roll();
        hasChanged();
        notifyObservers(model);
    }


    public void onLock(){
        model.lockDices();
        hasChanged();
        notifyObservers(model);
    }

    public void onClickedDice1(){
        if(model.getDice1() instanceof RollableDice)
        model.getDice1().setSelected();
        notifyObservers(model);

    }

    public void onClickedDice2(){
        if(model.getDice2() instanceof RollableDice)
        model.getDice2().setSelected();
        notifyObservers(model);
    }

    public void onClickedDice3(){
        if(model.getDice3() instanceof RollableDice)
        model.getDice3().setSelected();
        notifyObservers(model);
    }

    public void onClickedDice4(){
        if(model.getDice4() instanceof RollableDice)
            model.getDice4().setSelected();
            notifyObservers(model);
    }

    public void onclickedDice5(){
        if(model.getDice5() instanceof RollableDice)
            model.getDice5().setSelected();
            notifyObservers(model);
    }

    public void onClickedDice6() {
        if (model.getDice6() instanceof RollableDice)
            model.getDice6().setSelected();
            notifyObservers(model);

    }


    public ArrayList<Integer> getFaceVals(){
        return model.getFaceValues();
    }


    // --------CONSTRUCTOR METHODS ------------


    private  ArrayList<Dice> initDices(){
        ArrayList<Dice> trg = new ArrayList<>();
        for (int i = 0; i < 6 ; i++) {
            trg.add(new RollableDice());
        }

        return trg;
    }






}
