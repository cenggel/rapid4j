package com.v5ent.rapid4j.web.model;

public class Shipper {
    private String shipperid;

    private String shippername;

    public String getShipperid() {
        return shipperid;
    }

    public void setShipperid(String shipperid) {
        this.shipperid = shipperid == null ? null : shipperid.trim();
    }

    public String getShippername() {
        return shippername;
    }

    public void setShippername(String shippername) {
        this.shippername = shippername == null ? null : shippername.trim();
    }
}