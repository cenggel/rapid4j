package com.v5ent.rapid4j.web.model;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private String productid;

    private String productname;

    private String description;

    private BigDecimal unitprice;

    private String unitofmeasure;

    private Date datecreated;

    private Date dateupdated;

    private String supplierid;

    private String categoryid;

    private String quantityperunit;

    private String unitsinstock;

    private String unitsonorder;

    private String reorderlevel;

    private String discontinued;

    private String productcode;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public String getUnitofmeasure() {
        return unitofmeasure;
    }

    public void setUnitofmeasure(String unitofmeasure) {
        this.unitofmeasure = unitofmeasure == null ? null : unitofmeasure.trim();
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Date getDateupdated() {
        return dateupdated;
    }

    public void setDateupdated(Date dateupdated) {
        this.dateupdated = dateupdated;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid == null ? null : supplierid.trim();
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
    }

    public String getQuantityperunit() {
        return quantityperunit;
    }

    public void setQuantityperunit(String quantityperunit) {
        this.quantityperunit = quantityperunit == null ? null : quantityperunit.trim();
    }

    public String getUnitsinstock() {
        return unitsinstock;
    }

    public void setUnitsinstock(String unitsinstock) {
        this.unitsinstock = unitsinstock == null ? null : unitsinstock.trim();
    }

    public String getUnitsonorder() {
        return unitsonorder;
    }

    public void setUnitsonorder(String unitsonorder) {
        this.unitsonorder = unitsonorder == null ? null : unitsonorder.trim();
    }

    public String getReorderlevel() {
        return reorderlevel;
    }

    public void setReorderlevel(String reorderlevel) {
        this.reorderlevel = reorderlevel == null ? null : reorderlevel.trim();
    }

    public String getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(String discontinued) {
        this.discontinued = discontinued == null ? null : discontinued.trim();
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode == null ? null : productcode.trim();
    }
}