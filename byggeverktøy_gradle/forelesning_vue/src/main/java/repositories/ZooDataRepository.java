package repositories;
import models.Zoo;
import models.Chimp;
import models.HoneyBadger;
import models.Panda;
import java.util.ArrayList;

public interface ZooDataRepository implements ZooRepository {

    ArrayList<Zoo> zoos = new ArrayList<>();

    public ZooDataRepository(){
        Zoo kristiansand = new Zoo("Kristiansand");
        kristiansand.addAnimal(new Chimp("Julius", 90));
        kristiansand.addAnimal(new HoneyBadger("Randall"));
        kristiansand.addAnimal(new Panda("Po", "Black"));
        zoos.add(kristiansand);

        Zoo dummy = new Zoo("Dummy");
        dummy.addAnimal(new Chimp("Monke", 50));
        zoos.add(dummy);
    }

    @Override
    public Zoo getZoo(String zooName){
        for (Zoo zooX : zoos) {
            if (zooX.getName().equalsIgnoreCase(zooName)) {
                return zooX;
            }
        }
        return null;
    }
    
}
