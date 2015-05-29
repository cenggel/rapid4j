package com.v5ent.rapid4j.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderid like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderid not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerid is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerid is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(String value) {
            addCriterion("customerid =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(String value) {
            addCriterion("customerid <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(String value) {
            addCriterion("customerid >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(String value) {
            addCriterion("customerid >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(String value) {
            addCriterion("customerid <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(String value) {
            addCriterion("customerid <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLike(String value) {
            addCriterion("customerid like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotLike(String value) {
            addCriterion("customerid not like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<String> values) {
            addCriterion("customerid in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<String> values) {
            addCriterion("customerid not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(String value1, String value2) {
            addCriterion("customerid between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(String value1, String value2) {
            addCriterion("customerid not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNull() {
            addCriterion("orderdate is null");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNotNull() {
            addCriterion("orderdate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdateEqualTo(Date value) {
            addCriterionForJDBCDate("orderdate =", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("orderdate <>", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThan(Date value) {
            addCriterionForJDBCDate("orderdate >", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("orderdate >=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThan(Date value) {
            addCriterionForJDBCDate("orderdate <", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("orderdate <=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateIn(List<Date> values) {
            addCriterionForJDBCDate("orderdate in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("orderdate not in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("orderdate between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("orderdate not between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andRequireddateIsNull() {
            addCriterion("requireddate is null");
            return (Criteria) this;
        }

        public Criteria andRequireddateIsNotNull() {
            addCriterion("requireddate is not null");
            return (Criteria) this;
        }

        public Criteria andRequireddateEqualTo(Date value) {
            addCriterionForJDBCDate("requireddate =", value, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("requireddate <>", value, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateGreaterThan(Date value) {
            addCriterionForJDBCDate("requireddate >", value, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("requireddate >=", value, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateLessThan(Date value) {
            addCriterionForJDBCDate("requireddate <", value, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("requireddate <=", value, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateIn(List<Date> values) {
            addCriterionForJDBCDate("requireddate in", values, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("requireddate not in", values, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("requireddate between", value1, value2, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("requireddate not between", value1, value2, "requireddate");
            return (Criteria) this;
        }

        public Criteria andShipviaIsNull() {
            addCriterion("shipvia is null");
            return (Criteria) this;
        }

        public Criteria andShipviaIsNotNull() {
            addCriterion("shipvia is not null");
            return (Criteria) this;
        }

        public Criteria andShipviaEqualTo(String value) {
            addCriterion("shipvia =", value, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaNotEqualTo(String value) {
            addCriterion("shipvia <>", value, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaGreaterThan(String value) {
            addCriterion("shipvia >", value, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaGreaterThanOrEqualTo(String value) {
            addCriterion("shipvia >=", value, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaLessThan(String value) {
            addCriterion("shipvia <", value, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaLessThanOrEqualTo(String value) {
            addCriterion("shipvia <=", value, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaLike(String value) {
            addCriterion("shipvia like", value, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaNotLike(String value) {
            addCriterion("shipvia not like", value, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaIn(List<String> values) {
            addCriterion("shipvia in", values, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaNotIn(List<String> values) {
            addCriterion("shipvia not in", values, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaBetween(String value1, String value2) {
            addCriterion("shipvia between", value1, value2, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaNotBetween(String value1, String value2) {
            addCriterion("shipvia not between", value1, value2, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipnameIsNull() {
            addCriterion("shipname is null");
            return (Criteria) this;
        }

        public Criteria andShipnameIsNotNull() {
            addCriterion("shipname is not null");
            return (Criteria) this;
        }

        public Criteria andShipnameEqualTo(String value) {
            addCriterion("shipname =", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotEqualTo(String value) {
            addCriterion("shipname <>", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameGreaterThan(String value) {
            addCriterion("shipname >", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameGreaterThanOrEqualTo(String value) {
            addCriterion("shipname >=", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLessThan(String value) {
            addCriterion("shipname <", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLessThanOrEqualTo(String value) {
            addCriterion("shipname <=", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLike(String value) {
            addCriterion("shipname like", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotLike(String value) {
            addCriterion("shipname not like", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameIn(List<String> values) {
            addCriterion("shipname in", values, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotIn(List<String> values) {
            addCriterion("shipname not in", values, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameBetween(String value1, String value2) {
            addCriterion("shipname between", value1, value2, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotBetween(String value1, String value2) {
            addCriterion("shipname not between", value1, value2, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipaddressIsNull() {
            addCriterion("shipaddress is null");
            return (Criteria) this;
        }

        public Criteria andShipaddressIsNotNull() {
            addCriterion("shipaddress is not null");
            return (Criteria) this;
        }

        public Criteria andShipaddressEqualTo(String value) {
            addCriterion("shipaddress =", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressNotEqualTo(String value) {
            addCriterion("shipaddress <>", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressGreaterThan(String value) {
            addCriterion("shipaddress >", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressGreaterThanOrEqualTo(String value) {
            addCriterion("shipaddress >=", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressLessThan(String value) {
            addCriterion("shipaddress <", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressLessThanOrEqualTo(String value) {
            addCriterion("shipaddress <=", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressLike(String value) {
            addCriterion("shipaddress like", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressNotLike(String value) {
            addCriterion("shipaddress not like", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressIn(List<String> values) {
            addCriterion("shipaddress in", values, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressNotIn(List<String> values) {
            addCriterion("shipaddress not in", values, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressBetween(String value1, String value2) {
            addCriterion("shipaddress between", value1, value2, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressNotBetween(String value1, String value2) {
            addCriterion("shipaddress not between", value1, value2, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipcityIsNull() {
            addCriterion("shipcity is null");
            return (Criteria) this;
        }

        public Criteria andShipcityIsNotNull() {
            addCriterion("shipcity is not null");
            return (Criteria) this;
        }

        public Criteria andShipcityEqualTo(String value) {
            addCriterion("shipcity =", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityNotEqualTo(String value) {
            addCriterion("shipcity <>", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityGreaterThan(String value) {
            addCriterion("shipcity >", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityGreaterThanOrEqualTo(String value) {
            addCriterion("shipcity >=", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityLessThan(String value) {
            addCriterion("shipcity <", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityLessThanOrEqualTo(String value) {
            addCriterion("shipcity <=", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityLike(String value) {
            addCriterion("shipcity like", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityNotLike(String value) {
            addCriterion("shipcity not like", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityIn(List<String> values) {
            addCriterion("shipcity in", values, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityNotIn(List<String> values) {
            addCriterion("shipcity not in", values, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityBetween(String value1, String value2) {
            addCriterion("shipcity between", value1, value2, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityNotBetween(String value1, String value2) {
            addCriterion("shipcity not between", value1, value2, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipregionIsNull() {
            addCriterion("shipregion is null");
            return (Criteria) this;
        }

        public Criteria andShipregionIsNotNull() {
            addCriterion("shipregion is not null");
            return (Criteria) this;
        }

        public Criteria andShipregionEqualTo(String value) {
            addCriterion("shipregion =", value, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionNotEqualTo(String value) {
            addCriterion("shipregion <>", value, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionGreaterThan(String value) {
            addCriterion("shipregion >", value, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionGreaterThanOrEqualTo(String value) {
            addCriterion("shipregion >=", value, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionLessThan(String value) {
            addCriterion("shipregion <", value, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionLessThanOrEqualTo(String value) {
            addCriterion("shipregion <=", value, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionLike(String value) {
            addCriterion("shipregion like", value, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionNotLike(String value) {
            addCriterion("shipregion not like", value, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionIn(List<String> values) {
            addCriterion("shipregion in", values, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionNotIn(List<String> values) {
            addCriterion("shipregion not in", values, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionBetween(String value1, String value2) {
            addCriterion("shipregion between", value1, value2, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionNotBetween(String value1, String value2) {
            addCriterion("shipregion not between", value1, value2, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeIsNull() {
            addCriterion("shippostalcode is null");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeIsNotNull() {
            addCriterion("shippostalcode is not null");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeEqualTo(String value) {
            addCriterion("shippostalcode =", value, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeNotEqualTo(String value) {
            addCriterion("shippostalcode <>", value, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeGreaterThan(String value) {
            addCriterion("shippostalcode >", value, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("shippostalcode >=", value, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeLessThan(String value) {
            addCriterion("shippostalcode <", value, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeLessThanOrEqualTo(String value) {
            addCriterion("shippostalcode <=", value, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeLike(String value) {
            addCriterion("shippostalcode like", value, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeNotLike(String value) {
            addCriterion("shippostalcode not like", value, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeIn(List<String> values) {
            addCriterion("shippostalcode in", values, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeNotIn(List<String> values) {
            addCriterion("shippostalcode not in", values, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeBetween(String value1, String value2) {
            addCriterion("shippostalcode between", value1, value2, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeNotBetween(String value1, String value2) {
            addCriterion("shippostalcode not between", value1, value2, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShipcountryIsNull() {
            addCriterion("shipcountry is null");
            return (Criteria) this;
        }

        public Criteria andShipcountryIsNotNull() {
            addCriterion("shipcountry is not null");
            return (Criteria) this;
        }

        public Criteria andShipcountryEqualTo(String value) {
            addCriterion("shipcountry =", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryNotEqualTo(String value) {
            addCriterion("shipcountry <>", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryGreaterThan(String value) {
            addCriterion("shipcountry >", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryGreaterThanOrEqualTo(String value) {
            addCriterion("shipcountry >=", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryLessThan(String value) {
            addCriterion("shipcountry <", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryLessThanOrEqualTo(String value) {
            addCriterion("shipcountry <=", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryLike(String value) {
            addCriterion("shipcountry like", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryNotLike(String value) {
            addCriterion("shipcountry not like", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryIn(List<String> values) {
            addCriterion("shipcountry in", values, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryNotIn(List<String> values) {
            addCriterion("shipcountry not in", values, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryBetween(String value1, String value2) {
            addCriterion("shipcountry between", value1, value2, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryNotBetween(String value1, String value2) {
            addCriterion("shipcountry not between", value1, value2, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andOrdertotalIsNull() {
            addCriterion("ordertotal is null");
            return (Criteria) this;
        }

        public Criteria andOrdertotalIsNotNull() {
            addCriterion("ordertotal is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertotalEqualTo(Double value) {
            addCriterion("ordertotal =", value, "ordertotal");
            return (Criteria) this;
        }

        public Criteria andOrdertotalNotEqualTo(Double value) {
            addCriterion("ordertotal <>", value, "ordertotal");
            return (Criteria) this;
        }

        public Criteria andOrdertotalGreaterThan(Double value) {
            addCriterion("ordertotal >", value, "ordertotal");
            return (Criteria) this;
        }

        public Criteria andOrdertotalGreaterThanOrEqualTo(Double value) {
            addCriterion("ordertotal >=", value, "ordertotal");
            return (Criteria) this;
        }

        public Criteria andOrdertotalLessThan(Double value) {
            addCriterion("ordertotal <", value, "ordertotal");
            return (Criteria) this;
        }

        public Criteria andOrdertotalLessThanOrEqualTo(Double value) {
            addCriterion("ordertotal <=", value, "ordertotal");
            return (Criteria) this;
        }

        public Criteria andOrdertotalIn(List<Double> values) {
            addCriterion("ordertotal in", values, "ordertotal");
            return (Criteria) this;
        }

        public Criteria andOrdertotalNotIn(List<Double> values) {
            addCriterion("ordertotal not in", values, "ordertotal");
            return (Criteria) this;
        }

        public Criteria andOrdertotalBetween(Double value1, Double value2) {
            addCriterion("ordertotal between", value1, value2, "ordertotal");
            return (Criteria) this;
        }

        public Criteria andOrdertotalNotBetween(Double value1, Double value2) {
            addCriterion("ordertotal not between", value1, value2, "ordertotal");
            return (Criteria) this;
        }

        public Criteria andDateupdatedIsNull() {
            addCriterion("dateupdated is null");
            return (Criteria) this;
        }

        public Criteria andDateupdatedIsNotNull() {
            addCriterion("dateupdated is not null");
            return (Criteria) this;
        }

        public Criteria andDateupdatedEqualTo(Date value) {
            addCriterionForJDBCDate("dateupdated =", value, "dateupdated");
            return (Criteria) this;
        }

        public Criteria andDateupdatedNotEqualTo(Date value) {
            addCriterionForJDBCDate("dateupdated <>", value, "dateupdated");
            return (Criteria) this;
        }

        public Criteria andDateupdatedGreaterThan(Date value) {
            addCriterionForJDBCDate("dateupdated >", value, "dateupdated");
            return (Criteria) this;
        }

        public Criteria andDateupdatedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dateupdated >=", value, "dateupdated");
            return (Criteria) this;
        }

        public Criteria andDateupdatedLessThan(Date value) {
            addCriterionForJDBCDate("dateupdated <", value, "dateupdated");
            return (Criteria) this;
        }

        public Criteria andDateupdatedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dateupdated <=", value, "dateupdated");
            return (Criteria) this;
        }

        public Criteria andDateupdatedIn(List<Date> values) {
            addCriterionForJDBCDate("dateupdated in", values, "dateupdated");
            return (Criteria) this;
        }

        public Criteria andDateupdatedNotIn(List<Date> values) {
            addCriterionForJDBCDate("dateupdated not in", values, "dateupdated");
            return (Criteria) this;
        }

        public Criteria andDateupdatedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dateupdated between", value1, value2, "dateupdated");
            return (Criteria) this;
        }

        public Criteria andDateupdatedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dateupdated not between", value1, value2, "dateupdated");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}