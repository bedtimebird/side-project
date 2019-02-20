import java.util.Random;

public class Products {
  private String substance;
  private int minPrice;
  private int maxPrice; 


  public Products(String substance, int minPrice, int maxPrice){
    setSubstance(substance);
    setMinPrice(minPrice);
    setMaxPrice(maxPrice);
  }
  public String getSubstance() {return substance;}
  public void setSubstance(String substance){this.substance=substance;}
  public int getMinPrice() {return minPrice;}
  public void setMinPrice(int minPrice){this.minPrice=minPrice;}
  public int getMaxPrice() {return maxPrice;}
  public void setMaxPrice(int maxPrice){this.maxPrice=maxPrice;}

  public int getSellingPrice(int minPrice, int maxPrice) {
    Random rand = new Random();
    int n = rand.nextInt(maxPrice - minPrice) + minPrice;
    return n;
  }


  
}
