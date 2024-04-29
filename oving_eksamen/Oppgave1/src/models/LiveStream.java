package models;

import java.time.LocalDateTime;
import java.nio.channels.Channel;

public class LiveStream extends VisualMedia{
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public LiveStream(String title, double lengthInMinutes, Channel channel, LocalDateTime starTime, LocalDateTime endTime) {
        super(title, lengthInMinutes, channel);
        this.startTime = starTime;
        this.endTime = endTime;
    }
    public LocalDateTime getStarTime(){
        return startTime;
    }
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
    public LocalDateTime getEndTime() {
        return endTime;
    }
    public void setEndTime (LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void LiveStreamConnection()
}
