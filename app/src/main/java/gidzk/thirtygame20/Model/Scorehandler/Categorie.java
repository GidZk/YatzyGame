package gidzk.thirtygame20.Model.Scorehandler;

/**
 * Created by GidZk on 6/28/17.
 */

public class Categorie {
    private String categoryName;
    private int score;
   private boolean isTaken;


    Categorie(String catName){
        this.categoryName = catName;
        this.score = 0;
        this.isTaken = false;

    }


    @Override
    public int hashCode() {
        return categoryName.hashCode();
    }



    public boolean getisTaken(){
        return isTaken;
    }

    public int getScore(){
        return score;
    }

    protected void updateScore(int score){
        this.score = score;
    }


   protected void setTakenFalse(){
        isTaken = false;

    }

    protected  void setTakenTrue(){
        isTaken = true;
    }



    protected void reset(){
        score = 0;
        isTaken = false;

    }

}
