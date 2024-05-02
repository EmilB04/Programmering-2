package models;

import java.nio.channels.Channel;

public class Video extends VisualMedia {
    private int views;
    
    public Video(String title, double lengthInMinutes, int views, Channel channel) {
        super(title, lengthInMinutes, channel);
        this.views = views;
    }
    
    public int getViews() {
        return views;
    }
}
