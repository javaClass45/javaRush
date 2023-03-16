package com.javarush.task.task27.task2712.statistic;

import com.javarush.task.task27.task2712.statistic.event.EventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventType;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;


public class StatisticManager {
    private StatisticStorage statisticStorage=new StatisticStorage();

    private StatisticManager() {
    }

    public static StatisticManager getInstance() {
        return InstanceHolder.statisticManager;
    }

    public void register(EventDataRow data) {


    }

    private static class InstanceHolder {

        private static StatisticManager statisticManager = new StatisticManager();
    }

    private class StatisticStorage {
        private Map<EventType, List<EventDataRow>> storage = new HashMap<>();

        public StatisticStorage() {
            for (EventType eventType:EventType.values())
                storage.put(eventType,new ArrayList<EventDataRow>());
        }
//
//        private void put(EventDataRow data) {
//            if (data == null) return;
//            storage.get(data.getType()).add(data);
//        }
//
//        private List<EventDataRow> get(EventType eventType)
//        {
//            return storage.get(eventType);
//        }
    }


}



