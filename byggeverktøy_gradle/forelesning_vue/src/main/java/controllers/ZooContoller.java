package controllers;
import repositories.ZooRepository;
import models.Zoo;

import java.util.ArrayList;
import io.javalin.http.Context;

public class ZooContoller {
    private ZooRepository zooRepository;

    public ZooController(ZooRepository zooRepository) {
        this.zooRepository = zooRepository;
    }

    public Zoo getZooAnimals(Context ctx) {
        String zooNameParam = ctx.pathParam("zooName");
        ArrayList<Animal> zooAnimals = zooRepository.getZoo(zooNameParam).getAnimals();
        ctx.json(zooAnimals);
    }
}
