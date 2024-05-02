package models;

import java.nio.channels.Channel;
import java.time.LocalDateTime;

public class LiveStream extends VisualMedia {
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public LiveStream(String title, double lengthInMinutes, Channel channel, LocalDateTime startTime, LocalDateTime endTime){
        super(title, lengthInMinutes, channel);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
    
}