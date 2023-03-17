package com.javarush.task.task27.task2712.statistic.event;

import com.javarush.task.task27.task2712.ad.Advertisement;

import java.util.*;
import java.util.Date;

public class VideoSelectedEventDataRow implements EventDataRow {
    private long amount;
    private List<Advertisement> optimalVideoSet;
    private int totalDuration;
    private Date currentDate;

    public VideoSelectedEventDataRow(List<Advertisement> optimalVideoSet, long amount, int totalDuration) {
        this.amount = amount;
        this.optimalVideoSet = optimalVideoSet;
        this.totalDuration = totalDuration;
        this.currentDate = new Date();
    }


    @Override
    public Date getDate() {
        return currentDate;
    }

    @Override
    public int getTime() {
        return totalDuration;
    }

    @Override
    public EventType getType() {
        return EventType.SELECTED_VIDEOS;
    }
}
