public class Character {

private String name;
private int wallet;

  public Character(String name, int wallet){
    setName(name);
    setWallet(wallet);
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public void setWallet(int wallet) {
    this.wallet = wallet;
  }
  public int getWallet() {
    return wallet;
  }
  public void getCharacterStatus() {
    System.out.println("Name: " + getName());
    System.out.println("Wallet: $" + getWallet());
  }
}
