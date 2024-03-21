import java.util.ArrayList;

import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import models.SuperHero;

public class Application {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start();
        app.get("/", new Handler() {
            @Override
            public void handle(Context ctx) throws Exception {
                ctx.result("Hello Javalin!");
            }
        });

        app.get("/other-page", new Handler(){
            @Override
            public void handle(Context ctx) throws Exception {
                ctx.result("This is another page");
            }
        });


        ArrayList<SuperHero> superHeroes = new ArrayList<SuperHero>();

        superHeroes.add(new SuperHero("Superman", "Clark Kent"));
        superHeroes.add(new SuperHero("Batman", "Bruce Wayne"));
        superHeroes.add(new SuperHero("Wonder-Woman", "Diana Prince"));

        // API
        app.get("/api/superheroes", new Handler() {
            @Override
            public void handle(Context ctx) throws Exception {
                ctx.json(superHeroes);  
            }
        });
        // API for a specific superhero
        app.get("/api/superheroes/{name}", new Handler() {
            @Override
            public void handle(Context ctx) throws Exception {
                String specifiedName = ctx.pathParam("name");
                boolean found = false;
                for (SuperHero superHeroX : superHeroes) {
                    String superHeroXName = superHeroX.getName();
                    if (superHeroXName.equalsIgnoreCase(specifiedName)) {
                        ctx.json(superHeroX);
                        found = true;
                    }
                }
                if (!found) {
                    ctx.status(404).result("Superhero '" + specifiedName + "' was not found");
                }
            } 
        });
        // API for adding a superhero
        app.get("/api/superheroes/add/{name},{secretIdentity}", new Handler() {
            @Override
            public void handle(Context ctx) throws Exception {
                String name = ctx.pathParam("name");
                String secretIdentity = ctx.pathParam("secretIdentity");

                SuperHero newSuperHero = new SuperHero(name, secretIdentity);
                superHeroes.add(newSuperHero);

                ctx.status(201).result("The superhero " + name + " was added to the list of superheroes.");
            }
        });
    }
}