import java.util.ArrayList;

public class Main {
  
  public static void main(String[] args) {

    
    ArrayList<Animal> animals = new ArrayList<>();

    // add animals here
    animals.add(new Dog());

    // print em all
   /* for(int i = 0; i < animals.size(); i++) {
      animals.get(i).makeNoise();
    }*/

    for(Animal a : animals) {
      a.makeNoise();
    }


  }

}