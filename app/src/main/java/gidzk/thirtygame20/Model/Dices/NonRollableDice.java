package gidzk.thirtygame20.Model.Dices;

/**
 * Created by GidZk on 6/22/17.
 */

public class NonRollableDice extends Dice {


    public NonRollableDice(){
        super();
        selected = true;
    }


    public NonRollableDice(Dice copy) {
        super(copy);
        selected = true;
    }

    @Override
    public void roll() {
        // nothing done, dice is static
    }
}
