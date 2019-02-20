import java.util.Arrays; 

public class Backpack{
  private Products[] collection;
  private int BACKPACKSIZE = 100;
  private Character hero;
  
  public Backpack(Character hero){
    collection = new Products[BACKPACKSIZE];
    Arrays.fill(collection, null);
    setHero(hero);
  }

  public void setHero(Character hero) {this.hero = hero;}
  public Character getHero() {return hero;}  

  public int checkBackSize() {
    return collection.length;
  }

  public int checkHeroBalance() {
    int balance = hero.getWallet();
    return balance;
  }

  public int checkFreeSpace() {
    int count = 0;
    for (Products step : collection) {
      if(step == null) {
        ++count;
      }
    }
    return count;
  }

  public void addItemToBackpack2(int units, Products item){
    int count = units;
    while (count > 0){
      for (int i=0; i<collection.length; i++) {
        if (collection[i] == null) {
          collection[i] = item;
          count--;
        }
      }
    }
  }

  public void printBackpack() {
    for (int i=0; i<collection.length; i++) {
      System.out.print(collection[i].getSubstance() + " ,");
    }
  }
 


}
