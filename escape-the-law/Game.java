public class Game {
  private Character hero;
  private Travel travel;
  private Backpack backpack;
  private Narcos narcos;

  public Game(Character hero, Travel destinations, Backpack backpack, Narcos narcos){
    setHero(hero);
    setTravel(destinations);
    setBackpack(backpack);
    setNarcos(narcos);
  }
  public void setHero(Character hero) {this.hero = hero;}
  public Character getHero() {return hero;}
  public void setTravel(Travel destinations) {this.travel = destinations;}
  public Travel getTravel() {return travel;}
  public void setBackpack(Backpack backpack) {this.backpack = backpack;}
  public Backpack getBackpack() {return backpack;}
  public void setNarcos(Narcos narcos) {this.narcos = narcos;}
  public Narcos getNarcos() {return narcos;}

  public void optionsTree() {
    System.out.println(" ");
    System.out.println("Hey " + hero.getName());
    System.out.println("You are currently in " + travel.getCurrentLocation());
    System.out.println("What would you like to do?");
    System.out.println("1. Travel");
    System.out.println("2. Purchase goods");
    System.out.println("3. Sell goods");
    System.out.println("4. Check current status");
    switch(Checks.scanInputInt()) {
      case 1: travel.letsTravel();
              optionsTree();
              break;
      case 2: narcos.purchaseSupply();
              optionsTree();
              break;
      case 3: System.out.println("List of what you're carrying: ");
              break;
      case 4: System.out.println("Let's check on your current status...");
              hero.getCharacterStatus();
              break;
    }

  }

  

}
