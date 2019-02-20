import java.util.ArrayList;
import java.util.Collections;

public class Narcos {
  private String name;
  private ArrayList<Products> productList;
  private Backpack backpack;
  private int[] supplyPrice;
  private final int SUPPLY_SELECT = 4;

  public Narcos(String name, Backpack backpack) {
    setName(name);  
    createListOfProducts();
    setBackpack(backpack);
    }

  public void setName(String name) {this.name = name;}
  public String getName() {return name;}  
  
  public void setBackpack(Backpack backpack) {this.backpack = backpack;}
  public Backpack getBackpack() {return backpack;}  

  public void createListOfProducts() {
    productList = new ArrayList<Products>();
  }

  public void addProductsToList(Products supplyName) {
    productList.add(supplyName);
  } 

  public void selectRandomProducts() {
    Collections.shuffle(productList);
    supplyPrice = new int[SUPPLY_SELECT];
    for(int i=0; i<SUPPLY_SELECT; i++) {
      supplyPrice[i] = productList.get(i).getSellingPrice(productList.get(i).getMinPrice(), productList.get(i).getMaxPrice());
      System.out.println((i+1) + ". " + productList.get(i).getSubstance() + "....." + supplyPrice[i]);
    }
  }

  public void checkMaxPurchase(int item) {
    int maxFreeSpace = backpack.checkFreeSpace();
    int money = backpack.checkHeroBalance();
    int price = supplyPrice[item];
    int maxPurchase = money/price;
    if (maxPurchase >= maxFreeSpace && maxPurchase > 0) {
      System.out.println("You can purchase a maximum " + maxFreeSpace + " units of " + productList.get(item).getSubstance());
      makePurchase(maxPurchase, productList.get(item));
    } else if (maxPurchase < maxFreeSpace && maxPurchase > 0) {
      System.out.println("You can purchase a maximum " + (maxPurchase) + " units of " + productList.get(item).getSubstance());
      makePurchase(maxPurchase, productList.get(item));
    } else {
      System.out.println("Go home your drunk!");
      System.out.println("You cannot afford any " + productList.get(item).getSubstance());
    }
  }

  public void makePurchase(int maxPurchase, Products item) { 
    System.out.println("How much would you like to purchase? (" + maxPurchase + " max)");
    int purchaseRequest = Checks.scanInputInt();
    if (purchaseRequest > maxPurchase) {
      System.out.print("That amount is unrealistic!");
      makePurchase(maxPurchase, item);
    } else if (purchaseRequest <= maxPurchase && purchaseRequest > 0) {
      backpack.addItemToBackpack2(maxPurchase, item);
      backpack.printBackpack();
    }
  }

  public void purchaseSupply(){
    System.out.println("Welecome to the Narcos supply shop!");
    selectRandomProducts();
    System.out.println("You have " + backpack.checkFreeSpace() + " spots free and $" + backpack.checkHeroBalance());
    System.out.println("What would you like to purchase?");
    
    int item = (Checks.scanInputInt()-1);
    if(productList.contains(productList.get(item))) {
      System.out.println("So you wanna buy some  " + productList.get(item).getSubstance() + "???");
      checkMaxPurchase(item);

    } else {
      System.out.println("Nothing found");
    }

  }

  
}
