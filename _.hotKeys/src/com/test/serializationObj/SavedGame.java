package com.test.serializationObj;

import java.io.Serializable;

public class SavedGame implements Serializable {
    private Territories territories;
    private Resources resources;
    private Diplomacy diplomacy;

    public SavedGame(Territories territories, Resources resources, Diplomacy diplomacy) {
        this.territories = territories;
        this.resources = resources;
        this.diplomacy = diplomacy;
    }

    public Territories getTerritories() {
        return territories;
    }

    public void setTerritories(Territories territories) {
        this.territories = territories;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    public Diplomacy getDiplomacy() {
        return diplomacy;
    }

    public void setDiplomacy(Diplomacy diplomacy) {
        this.diplomacy = diplomacy;
    }

    @Override
    public String toString() {
        return "SavedGame\n{" +
                "territories=" + territories +
                ",\n resources=" + resources +
                ",\n diplomacy=" + diplomacy +
                '}';
    }
}
