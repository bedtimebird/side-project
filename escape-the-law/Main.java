//writing up of these 'products' definitely less interested in making game about selling drugs
//option to do something else...stocks. what do you need to travel around and buy and sell these days???
//cars -or- stocks -or- viruses..buying and selling computer viruses
//i like that. mr. robot. 
//so how does it work???buy and sell computer viruses
//

class Main {
  public static void main(String[] args) {
    Character birdMan = new Character("El Chapo", 1000);
    Travel destinations = new Travel(birdMan, "Vancouver");
    
    Location victoria = new Location("Victoria", 85792, 48.428611, -123.365556);
    Location nanaimo = new Location("Nanaimo", 90504, 49.164167, -123.936389);
    Location vancouver = new Location("Vancouver", 631486, 49.25, -123.1);
    Location kelowna = new Location("Kelowna", 123380, 49.888056, -119.495556);
    Location kamloops = new Location("Kamloops", 90280, 50.676111, -120.340833);
    Location abbotsford = new Location("Abbotsford", 141397, 49.05,  -122.316667);
    Location whiterock = new Location("White Rock", 19952, 49.019917,  -122.802611);        

    destinations.addCityDestination(victoria);
    destinations.addCityDestination(nanaimo);
    destinations.addCityDestination(vancouver);
    destinations.addCityDestination(kelowna);
    destinations.addCityDestination(kamloops);
    destinations.addCityDestination(abbotsford);
    destinations.addCityDestination(whiterock);           

    Products her = new Products("He", 500, 1000); //Heroin
    Products lsd = new Products("LS", 25, 50); //LSD
    Products can = new Products("Me", 30, 50); //Mescaline
    Products mes = new Products("He", 1000, 5000); //Heroin
    Products mdma = new Products("MD", 10, 20); //MDMA
    Products psil = new Products("Ps", 5, 30); //Psilocybin
    Products khat = new Products("Kh", 3, 7); //Khat
    Products coc = new Products("Co", 500, 1000); //Cocaine
    Products bath = new Products("Ba", 5, 15); //Bath Salts

    Backpack back = new Backpack(birdMan);
    Narcos chappo = new Narcos("Mr. Chapito", back);
    chappo.addProductsToList(her);
    chappo.addProductsToList(lsd);
    chappo.addProductsToList(can);
    chappo.addProductsToList(mes);    
    chappo.addProductsToList(mdma);
    chappo.addProductsToList(psil);
    chappo.addProductsToList(khat);
    chappo.addProductsToList(coc);
    chappo.addProductsToList(bath);

    Game newGame = new Game(birdMan, destinations, back, chappo);
    newGame.optionsTree();


  }
}
