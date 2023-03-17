package com.javarush.task.task27.task2712.statistic;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.statistic.event.EventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventType;

import java.util.*;


public class StatisticManager {
    private static StatisticManager ourInstance = new StatisticManager();

    private Set<Cook> cooks = new HashSet<>();

    private StatisticStorage statisticStorage = new StatisticStorage();

    private StatisticManager() {
    }

    public static StatisticManager getInstance() {
        return InstanceHolder.statisticManager;
    }

    public void register(EventDataRow data) {
        if (data == null) return;
        statisticStorage.put(data);

    }

    public void register(Cook cook) {
        this.cooks.add(cook);
    }

    private static class InstanceHolder {

        private static StatisticManager statisticManager = new StatisticManager();
    }

    private class StatisticStorage {
        private Map<EventType, List<EventDataRow>> storage = new HashMap<>();

        private StatisticStorage() {
            for (EventType type : EventType.values()) {
                this.storage.put(type, new ArrayList<EventDataRow>());
            }
        }

        private void put(EventDataRow data) {
            EventType type = data.getType();
            if (!this.storage.containsKey(type))
                throw new UnsupportedOperationException();

            this.storage.get(type).add(data);
        }
    }


}



