/*
 * Klassen Video kan beskrives ved at den har følgende egenskaper (variabler):
 * • title - En tekststreng
 * • lengthInMinutes - Et desimaltall
 * • views - Et heltall
 * • channel - Et objekt av en klasse Channel (For denne oppgaven er det ikke
 * viktig hva
 * denne klassen inneholder)
 */

package models;
import java.nio.channels.Channel;
public class Video extends VisualMedia{
    private int views;

    public Video(String title, double lengthInMinutes, Channel channel, int views) {
        super(title, lengthInMinutes, channel);
        this.views = views;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }

}    

