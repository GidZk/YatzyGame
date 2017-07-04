package gidzk.thirtygame20.Model.Scorehandler;

import java.util.ArrayList;
import java.util.HashMap;



public class ScoreHandler {

    protected HashMap<Categorie,Integer> map;


    protected Categorie low;
    protected Categorie four;
    protected Categorie five;
    protected Categorie six;
    protected Categorie seven;
    protected Categorie eight;
    protected Categorie nine;
    protected Categorie ten;
    protected Categorie eleven;
    protected Categorie twelve;

    ArrayList<Integer> faceValues;

    public ScoreHandler(){
  ;
        createCategories();
        this.faceValues = new ArrayList<>();
                // map = new HashMap<>()
                //  initHashMap();

    }
    /*
   protected void updateScore(Categorie c ,int score){
       c.updateScore(score);
        map.put(c,score);
    }

*/

    protected void updatelow(int score){
        low.updateScore(score);
        low.setTakenTrue();
    }

    protected void updateFours(int score){
        four.updateScore(score);
        four.setTakenFalse();

    }

    protected void updateFives(int score){
        five.updateScore(score);
        five.setTakenTrue();
    }

    protected void updateSixes(int score){
        six.updateScore(score);
        six.setTakenTrue();
    }

    protected void updateSevens(int score){
        seven.updateScore(score);
        seven.setTakenTrue();
    }

    protected void updateEights(int score){
        eight.updateScore(score);
        eight.setTakenTrue();
    }

    protected void updateNines(int score){
        nine.updateScore(score);
        nine.setTakenTrue();
    }

    protected void updateTens(int score){
        ten.updateScore(score);
        ten.setTakenTrue();

    }

    protected void updateElevens(int score){
        eleven.updateScore(score);
        eleven.setTakenTrue();

    }

    protected void updateTwelves(int score){
       twelve.updateScore(score);
        twelve.setTakenTrue();
    }








    // CONSTRUCTOR METHODS
    private void initHashMap(){
        map.put(low,0);
        map.put(four,0);
        map.put(five,0);
        map.put(six,0);
        map.put(seven,0);
        map.put(eight,0);
        map.put(nine,0);
        map.put(ten,0);
        map.put(eleven,0);
        map.put(twelve,0);


    }


    private void createCategories(){
    this.low    = new Categorie("low");
    this.four   = new Categorie("four");
    this.five   = new Categorie("five");
    this.six    = new Categorie("six");
    this.seven  = new Categorie("seven");
    this.eight  = new Categorie("eight");
    this.nine   = new Categorie("nine");
    this.ten    = new Categorie("ten");
    this.eleven = new Categorie("eleven");
    this.twelve = new Categorie("twelve");

}


}
