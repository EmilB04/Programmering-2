import org.jetbrains.annotations.NotNull;
import controllers.ZooContoller;
import io.javalin.http.Context;
import java.util.ArrayList;
import io.javalin.Javalin;
import io.javalin.http.Handler;
import io.javalin.vue.VueComponent;
import models.Chimp;
import models.HoneyBadger;
import models.Zoo;
import models.Panda;
import repositories.ZooDataRepository;
import repositories.ZooRepository;

public class Application {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.staticFiles.enableWebjars();
            config.vue.vueInstanceNameInJs = "app";
        }).start();

        ZooDataRepository zooDataRepository = new ZooDataRepository();
        ZooContoller zooController = new ZooContoller(zooDataRepository);
    
        app.get("/api/zoo/{zooName}", new Handler() {
            @Override
            public void handle(@NotNull Context ctx) throws Exception {
                zooController.getZooAnimals(ctx);
            }
        });
    }
}
