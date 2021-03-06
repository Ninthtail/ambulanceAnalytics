package com.analytics.ambulance.entities;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexType;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


/**
 * Created by lenovo on 16/7/17.
 */
@Document(collection = "trial")
public class Ambulance {
    @Id
    String id;
    @Field("amb_id")
    String ambulanceId;
    @Field("amb_number")
    String licensePlateNumber;
    @Field("driver_name")
    String driverName;
    @Field("status")
    String status;
    @Field("driver_licence_id")
    String driverLicenseNumber;
    @Field("ownership")
    String ownerShip;
    @Field("ownership_address")
    String ownerShipAddress;
    Point location;

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmbulanceId() {
        return ambulanceId;
    }

    public void setAmbulanceId(String ambulanceId) {
        this.ambulanceId = ambulanceId;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public String getOwnerShip() {
        return ownerShip;
    }

    public void setOwnerShip(String ownerShip) {
        this.ownerShip = ownerShip;
    }

    public String getOwnerShipAddress() {
        return ownerShipAddress;
    }

    public void setOwnerShipAddress(String ownerShipAddress) {
        this.ownerShipAddress = ownerShipAddress;
    }

}
