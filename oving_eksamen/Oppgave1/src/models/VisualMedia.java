package models;

import java.nio.channels.Channel;

public class VisualMedia {
    private String title;
    private double lengthInMinutes;
    private Channel channel;

    public VisualMedia(String title, double lengthInMinutes, Channel channel) {
        this.title = title;
        this.lengthInMinutes = lengthInMinutes;
        this.channel = channel;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getLengthInMinutes() {
        return lengthInMinutes;
    }
    public void setLengthInMinutes(double lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }
    public Channel getChannel() {
        return channel;
    }
    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}



