package com.test.serializationPrimitive;

import java.io.Serializable;
import java.util.Arrays;

public class SavedGame implements Serializable {
    private static final long serializableVersionID = 1L;

    private String[] territoriesInfo;
    private String[] resourcesInfo;
    private String[] diplomacyInfo;

    public SavedGame(String[] territoriesInfo, String[] resourcesInfo, String[] diplomacyInfo) {
        this.territoriesInfo = territoriesInfo;
        this.resourcesInfo = resourcesInfo;
        this.diplomacyInfo = diplomacyInfo;
    }

    public String[] getTerritoriesInfo() {
        return territoriesInfo;
    }

    public void setTerritoriesInfo(String[] territoriesInfo) {
        this.territoriesInfo = territoriesInfo;
    }

    public String[] getResourcesInfo() {
        return resourcesInfo;
    }

    public void setResourcesInfo(String[] resourcesInfo) {
        this.resourcesInfo = resourcesInfo;
    }

    public String[] getDiplomacyInfo() {
        return diplomacyInfo;
    }

    public void setDiplomacyInfo(String[] diplomacyInfo) {
        this.diplomacyInfo = diplomacyInfo;
    }

    @Override
    public String toString() {
        return "SavedGame\n{" +
                "territoriesInfo=" + Arrays.toString(territoriesInfo) +
                ",\n resourcesInfo=" + Arrays.toString(resourcesInfo) +
                ",\n diplomacyInfo=" + Arrays.toString(diplomacyInfo) +
                '}';
    }


}
