package models;
import java.nio.channels.Channel;
public class Video extends VisualMedia{
    private int views;
    static int totalNumberOfVideoes = 0;

    public Video(String title, double lengthInMinutes, Channel channel, int views) {
        super(title, lengthInMinutes, channel);
        this.views = views;
        totalNumberOfVideoes++;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }


    public static void printTotalNumberOfVideoes() {
        System.out.println("The total number of videoes creates is" + totalNumberOfVideoes);
    }

}    

