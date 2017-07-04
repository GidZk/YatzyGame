package gidzk.thirtygame20.Model.Dices;

/**
 * Created by GidZk on 6/22/17.
 */

public class NonRollableDice extends Dice {


    public NonRollableDice(){
        super();
    }


    public NonRollableDice(Dice copy) {
        super(copy);
    }

    @Override
    public void roll() {
        // nothing done, dice is static
    }
}
