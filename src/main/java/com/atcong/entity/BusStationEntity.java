package com.atcong.entity;

import javax.persistence.*;

@Entity
@Table(name = "bus_station", schema = "graduation")
public class BusStationEntity {
    private int stationId;
    private String stationName;
    private Integer routeId;
    private String busPostison;

    @Id
    @Column(name = "station_id")
    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }


    @Basic
    @Column(name = "station_name")
    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BusStationEntity that = (BusStationEntity) o;

        if (stationId != that.stationId) return false;
        if (stationName != null ? !stationName.equals(that.stationName) : that.stationName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stationId;
        result = 31 * result + (stationName != null ? stationName.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "route_id")
    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    @Basic
    @Column(name = "bus_postison")
    public String getBusPostison() {
        return busPostison;
    }

    public void setBusPostison(String busPostison) {
        this.busPostison = busPostison;
    }
}
