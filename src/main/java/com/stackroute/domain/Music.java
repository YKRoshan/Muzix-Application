package com.stackroute.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Music {
    @Id
    int trackId;
    String trackName;
    String trackComments;
/*
{
"trackId":1,
"trackName":"despacito"'
"trackComments":"Most viewed"
}

 */
    public Music() {
    }

    public Music(int trackId, String trackName, String trackComments) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackComments = trackComments;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackComments() {
        return trackComments;
    }

    public void setTrackComments(String trackComments) {
        this.trackComments = trackComments;
    }

    @Override
    public String toString() {
        return "Music{" +
                "trackId=" + trackId +
                ", trackName='" + trackName + '\'' +
                ", trackComments='" + trackComments + '\'' +
                '}';
    }
}
