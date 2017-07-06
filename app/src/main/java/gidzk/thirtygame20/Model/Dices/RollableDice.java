package gidzk.thirtygame20.Model.Dices;

/**
 * Created by GidZk on 6/22/17.
 */

public class RollableDice extends Dice {


    RollableDice(Dice copy) {
        super(copy);
    }

    public RollableDice() {
        super();
        selected = false;
    }

    @Override
    public void roll() {
        faceVal = rand.nextInt(6) +1;
    }

}
