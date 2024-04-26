package models;

import java.util.ArrayList;

public class Channel {
    public String Name;
    public ArrayList<Object> visualMedias;
    public int videoViews;

    public updateVideoViews(){
        int counter = 0;
        for (VisualMedia visualMediaX : visualMedias) {
            if (visualMediaX instanceof Video) {
                counter += ((Video) visualMediaX).getViews()
            }
        }
    }
}
