import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;

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
    }
}
