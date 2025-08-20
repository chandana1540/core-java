package com.xworkz.policestationapp.police;

public class Police {
    String nameOfStation;
    String location;
    String stationId;
    int noOfConstables;

    public void setNameOfStation(String nameOfStation) {
        this.nameOfStation = nameOfStation;
    }

    public String getNameOfStation() {
        return nameOfStation;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationId() {
        return stationId;
    }

    public void setNoOfConstables(int noOfConstables) {
        this.noOfConstables = noOfConstables;
    }

    public int getNoOfConstables() {
        return noOfConstables;
    }
}
