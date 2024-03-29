package models;
import java.util.ArrayList;


public class SuperHero {
    private String name;
    private String realName;
    private ArrayList<SuperHero> sideKicks = new ArrayList<>();

    public SuperHero(String name, String realName){
        this.name = name;
        this.realName = realName;
    }

    public SuperHero() {
        sideKicks = new ArrayList<>();
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setRealName(String realName){
        this.realName = realName;
    }
    public String getRealName() {
        return realName;
    }
    public ArrayList<SuperHero> getSideKicks() {
        return sideKicks;
    }
}
