public class Location {
  private String city;
  private int population;
  private double latitude;
  private double longitude;

  public Location(String city, int population, double latitude, double longitude){
    setCity(city);
    setPopulation(population);
    setLatitude(latitude);
    setLongitude(longitude);
  }
  public String getCity() {return city;}
  public void setCity(String city){this.city=city;}

  public int getPopulation() {return population;}
  public void setPopulation(int population){this.population=population;}

  public double getLatitude() {return latitude;}
  public void setLatitude(double latitude){this.latitude=latitude;}

  public double getLongitude() {return longitude;}
  public void setLongitude(double longitude){this.longitude=longitude;}

  public void printCity() {
    System.out.println(getCity());
  }


}
