import java.util.ArrayList;

public class Travel {
  private String currentLocation;
  private ArrayList<Location> locations;

  public Travel(Character hero, String location) {
    setCurrentLocation(location);
    locations = new ArrayList<Location>();
  }
  public void setCurrentLocation(String newLocation) {
    this.currentLocation = newLocation;
  }
  public String getCurrentLocation() {
    return currentLocation;
  }
  public void printCurrentLocation() {
    System.out.println("Current location: " + getCurrentLocation());
  }
  public void addCityDestination(Location destination) {
    locations.add(destination);
  }

  public void printAllDestinations() {
    for(int i=0; i<locations.size(); i++) {
      System.out.println((i+1) + ". " + locations.get(i).getCity());
    }
  }

  public void letsTravel() {
    System.out.println("You are currently located in " + getCurrentLocation());
    System.out.println("Where would you like to travel too?");
    printAllDestinations();
    int newLocation = (Checks.scanInputInt()-1);
    if(locations.contains(locations.get(newLocation))) {
      setCurrentLocation(locations.get(newLocation).getCity());
      System.out.println("You are now in " + getCurrentLocation());
    } else {
      System.out.println("Nothing found");
      letsTravel();
    }
  }

}
