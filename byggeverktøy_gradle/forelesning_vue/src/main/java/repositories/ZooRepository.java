package repositories;
import models.Zoo;

public interface ZooRepository {
    Zoo getZoo(String name);
}
