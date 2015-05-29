package com.v5ent.rapid4j.web.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductidIsNull() {
            addCriterion("productid is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productid is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(String value) {
            addCriterion("productid =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(String value) {
            addCriterion("productid <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(String value) {
            addCriterion("productid >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(String value) {
            addCriterion("productid >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(String value) {
            addCriterion("productid <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(String value) {
            addCriterion("productid <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLike(String value) {
            addCriterion("productid like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotLike(String value) {
            addCriterion("productid not like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<String> values) {
            addCriterion("productid in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<String> values) {
            addCriterion("productid not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(String value1, String value2) {
            addCriterion("productid between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(String value1, String value2) {
            addCriterion("productid not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productname is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productname is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productname =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productname <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productname >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productname >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productname <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productname <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productname like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productname not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productname in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productname not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productname between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productname not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNull() {
            addCriterion("unitprice is null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNotNull() {
            addCriterion("unitprice is not null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceEqualTo(BigDecimal value) {
            addCriterion("unitprice =", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotEqualTo(BigDecimal value) {
            addCriterion("unitprice <>", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThan(BigDecimal value) {
            addCriterion("unitprice >", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unitprice >=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThan(BigDecimal value) {
            addCriterion("unitprice <", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unitprice <=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIn(List<BigDecimal> values) {
            addCriterion("unitprice in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotIn(List<BigDecimal> values) {
            addCriterion("unitprice not in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unitprice between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unitprice not between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitofmeasureIsNull() {
            addCriterion("unitofmeasure is null");
            return (Criteria) this;
        }

        public Criteria andUnitofmeasureIsNotNull() {
            addCriterion("unitofmeasure is not null");
            return (Criteria) this;
        }

        public Criteria andUnitofmeasureEqualTo(String value) {
            addCriterion("unitofmeasure =", value, "unitofmeasure");
            return (Criteria) this;
        }

        public Criteria andUnitofmeasureNotEqualTo(String value) {
            addCriterion("unitofmeasure <>", value, "unitofmeasure");
            return (Criteria) this;
        }

        public Criteria andUnitofmeasureGreaterThan(String value) {
            addCriterion("unitofmeasure >", value, "unitofmeasure");
            return (Criteria) this;
        }

        public Criteria andUnitofmeasureGreaterThanOrEqualTo(String value) {
            addCriterion("unitofmeasure >=", value, "unitofmeasure");
            return (Criteria) this;
        }

        public Criteria andUnitofmeasureLessThan(String value) {
            addCriterion("unitofmeasure <", value, "unitofmeasure");
            return (Criteria) this;
        }

        public Criteria andUnitofmeasureLessThanOrEqualTo(String value) {
            addCriterion("unitofmeasure <=", value, "unitofmeasure");
            return (Criteria) this;
        }

        public Criteria andUnitofmeasureLike(String value) {
            addCriterion("unitofmeasure like", value, "unitofmeasure");
            return (Criteria) this;
        }

        public Criteria andUnitofmeasureNotLike(String value) {
            addCriterion("unitofmeasure not like", value, "unitofmeasure");
            return (Criteria) this;
        }

        public Criteria andUnitofmeasureIn(List<String> values) {
            addCriterion("unitofmeasure in", values, "unitofmeasure");
            return (Criteria) this;
        }

        public Criteria andUnitofmeasureNotIn(List<String> values) {
            addCriterion("unitofmeasure not in", values, "unitofmeasure");
            return (Criteria) this;
        }

        public Criteria andUnitofmeasureBetween(String value1, String value2) {
            addCriterion("unitofmeasure between", value1, value2, "unitofmeasure");
            return (Criteria) this;
        }

        public Criteria andUnitofmeasureNotBetween(String value1, String value2) {
            addCriterion("unitofmeasure not between", value1, value2, "unitofmeasure");
            return (Criteria) this;
        }

        public Criteria andDatecreatedIsNull() {
            addCriterion("datecreated is null");
            return (Criteria) this;
        }

        public Criteria andDatecreatedIsNotNull() {
            addCriterion("datecreated is not null");
            return (Criteria) this;
        }

        public Criteria andDatecreatedEqualTo(Date value) {
            addCriterionForJDBCDate("datecreated =", value, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedNotEqualTo(Date value) {
            addCriterionForJDBCDate("datecreated <>", value, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedGreaterThan(Date value) {
            addCriterionForJDBCDate("datecreated >", value, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datecreated >=", value, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedLessThan(Date value) {
            addCriterionForJDBCDate("datecreated <", value, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datecreated <=", value, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedIn(List<Date> values) {
            addCriterionForJDBCDate("datecreated in", values, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedNotIn(List<Date> values) {
            addCriterionForJDBCDate("datecreated not in", values, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datecreated between", value1, value2, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datecreated not between", value1, value2, "datecreated");
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

        public Criteria andSupplieridIsNull() {
            addCriterion("supplierid is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("supplierid is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(String value) {
            addCriterion("supplierid =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(String value) {
            addCriterion("supplierid <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(String value) {
            addCriterion("supplierid >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(String value) {
            addCriterion("supplierid >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(String value) {
            addCriterion("supplierid <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(String value) {
            addCriterion("supplierid <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLike(String value) {
            addCriterion("supplierid like", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotLike(String value) {
            addCriterion("supplierid not like", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<String> values) {
            addCriterion("supplierid in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<String> values) {
            addCriterion("supplierid not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(String value1, String value2) {
            addCriterion("supplierid between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(String value1, String value2) {
            addCriterion("supplierid not between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("categoryid is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("categoryid is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(String value) {
            addCriterion("categoryid =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(String value) {
            addCriterion("categoryid <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(String value) {
            addCriterion("categoryid >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(String value) {
            addCriterion("categoryid >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(String value) {
            addCriterion("categoryid <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(String value) {
            addCriterion("categoryid <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLike(String value) {
            addCriterion("categoryid like", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotLike(String value) {
            addCriterion("categoryid not like", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<String> values) {
            addCriterion("categoryid in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<String> values) {
            addCriterion("categoryid not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(String value1, String value2) {
            addCriterion("categoryid between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(String value1, String value2) {
            addCriterion("categoryid not between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andQuantityperunitIsNull() {
            addCriterion("quantityperunit is null");
            return (Criteria) this;
        }

        public Criteria andQuantityperunitIsNotNull() {
            addCriterion("quantityperunit is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityperunitEqualTo(String value) {
            addCriterion("quantityperunit =", value, "quantityperunit");
            return (Criteria) this;
        }

        public Criteria andQuantityperunitNotEqualTo(String value) {
            addCriterion("quantityperunit <>", value, "quantityperunit");
            return (Criteria) this;
        }

        public Criteria andQuantityperunitGreaterThan(String value) {
            addCriterion("quantityperunit >", value, "quantityperunit");
            return (Criteria) this;
        }

        public Criteria andQuantityperunitGreaterThanOrEqualTo(String value) {
            addCriterion("quantityperunit >=", value, "quantityperunit");
            return (Criteria) this;
        }

        public Criteria andQuantityperunitLessThan(String value) {
            addCriterion("quantityperunit <", value, "quantityperunit");
            return (Criteria) this;
        }

        public Criteria andQuantityperunitLessThanOrEqualTo(String value) {
            addCriterion("quantityperunit <=", value, "quantityperunit");
            return (Criteria) this;
        }

        public Criteria andQuantityperunitLike(String value) {
            addCriterion("quantityperunit like", value, "quantityperunit");
            return (Criteria) this;
        }

        public Criteria andQuantityperunitNotLike(String value) {
            addCriterion("quantityperunit not like", value, "quantityperunit");
            return (Criteria) this;
        }

        public Criteria andQuantityperunitIn(List<String> values) {
            addCriterion("quantityperunit in", values, "quantityperunit");
            return (Criteria) this;
        }

        public Criteria andQuantityperunitNotIn(List<String> values) {
            addCriterion("quantityperunit not in", values, "quantityperunit");
            return (Criteria) this;
        }

        public Criteria andQuantityperunitBetween(String value1, String value2) {
            addCriterion("quantityperunit between", value1, value2, "quantityperunit");
            return (Criteria) this;
        }

        public Criteria andQuantityperunitNotBetween(String value1, String value2) {
            addCriterion("quantityperunit not between", value1, value2, "quantityperunit");
            return (Criteria) this;
        }

        public Criteria andUnitsinstockIsNull() {
            addCriterion("unitsinstock is null");
            return (Criteria) this;
        }

        public Criteria andUnitsinstockIsNotNull() {
            addCriterion("unitsinstock is not null");
            return (Criteria) this;
        }

        public Criteria andUnitsinstockEqualTo(String value) {
            addCriterion("unitsinstock =", value, "unitsinstock");
            return (Criteria) this;
        }

        public Criteria andUnitsinstockNotEqualTo(String value) {
            addCriterion("unitsinstock <>", value, "unitsinstock");
            return (Criteria) this;
        }

        public Criteria andUnitsinstockGreaterThan(String value) {
            addCriterion("unitsinstock >", value, "unitsinstock");
            return (Criteria) this;
        }

        public Criteria andUnitsinstockGreaterThanOrEqualTo(String value) {
            addCriterion("unitsinstock >=", value, "unitsinstock");
            return (Criteria) this;
        }

        public Criteria andUnitsinstockLessThan(String value) {
            addCriterion("unitsinstock <", value, "unitsinstock");
            return (Criteria) this;
        }

        public Criteria andUnitsinstockLessThanOrEqualTo(String value) {
            addCriterion("unitsinstock <=", value, "unitsinstock");
            return (Criteria) this;
        }

        public Criteria andUnitsinstockLike(String value) {
            addCriterion("unitsinstock like", value, "unitsinstock");
            return (Criteria) this;
        }

        public Criteria andUnitsinstockNotLike(String value) {
            addCriterion("unitsinstock not like", value, "unitsinstock");
            return (Criteria) this;
        }

        public Criteria andUnitsinstockIn(List<String> values) {
            addCriterion("unitsinstock in", values, "unitsinstock");
            return (Criteria) this;
        }

        public Criteria andUnitsinstockNotIn(List<String> values) {
            addCriterion("unitsinstock not in", values, "unitsinstock");
            return (Criteria) this;
        }

        public Criteria andUnitsinstockBetween(String value1, String value2) {
            addCriterion("unitsinstock between", value1, value2, "unitsinstock");
            return (Criteria) this;
        }

        public Criteria andUnitsinstockNotBetween(String value1, String value2) {
            addCriterion("unitsinstock not between", value1, value2, "unitsinstock");
            return (Criteria) this;
        }

        public Criteria andUnitsonorderIsNull() {
            addCriterion("unitsonorder is null");
            return (Criteria) this;
        }

        public Criteria andUnitsonorderIsNotNull() {
            addCriterion("unitsonorder is not null");
            return (Criteria) this;
        }

        public Criteria andUnitsonorderEqualTo(String value) {
            addCriterion("unitsonorder =", value, "unitsonorder");
            return (Criteria) this;
        }

        public Criteria andUnitsonorderNotEqualTo(String value) {
            addCriterion("unitsonorder <>", value, "unitsonorder");
            return (Criteria) this;
        }

        public Criteria andUnitsonorderGreaterThan(String value) {
            addCriterion("unitsonorder >", value, "unitsonorder");
            return (Criteria) this;
        }

        public Criteria andUnitsonorderGreaterThanOrEqualTo(String value) {
            addCriterion("unitsonorder >=", value, "unitsonorder");
            return (Criteria) this;
        }

        public Criteria andUnitsonorderLessThan(String value) {
            addCriterion("unitsonorder <", value, "unitsonorder");
            return (Criteria) this;
        }

        public Criteria andUnitsonorderLessThanOrEqualTo(String value) {
            addCriterion("unitsonorder <=", value, "unitsonorder");
            return (Criteria) this;
        }

        public Criteria andUnitsonorderLike(String value) {
            addCriterion("unitsonorder like", value, "unitsonorder");
            return (Criteria) this;
        }

        public Criteria andUnitsonorderNotLike(String value) {
            addCriterion("unitsonorder not like", value, "unitsonorder");
            return (Criteria) this;
        }

        public Criteria andUnitsonorderIn(List<String> values) {
            addCriterion("unitsonorder in", values, "unitsonorder");
            return (Criteria) this;
        }

        public Criteria andUnitsonorderNotIn(List<String> values) {
            addCriterion("unitsonorder not in", values, "unitsonorder");
            return (Criteria) this;
        }

        public Criteria andUnitsonorderBetween(String value1, String value2) {
            addCriterion("unitsonorder between", value1, value2, "unitsonorder");
            return (Criteria) this;
        }

        public Criteria andUnitsonorderNotBetween(String value1, String value2) {
            addCriterion("unitsonorder not between", value1, value2, "unitsonorder");
            return (Criteria) this;
        }

        public Criteria andReorderlevelIsNull() {
            addCriterion("reorderlevel is null");
            return (Criteria) this;
        }

        public Criteria andReorderlevelIsNotNull() {
            addCriterion("reorderlevel is not null");
            return (Criteria) this;
        }

        public Criteria andReorderlevelEqualTo(String value) {
            addCriterion("reorderlevel =", value, "reorderlevel");
            return (Criteria) this;
        }

        public Criteria andReorderlevelNotEqualTo(String value) {
            addCriterion("reorderlevel <>", value, "reorderlevel");
            return (Criteria) this;
        }

        public Criteria andReorderlevelGreaterThan(String value) {
            addCriterion("reorderlevel >", value, "reorderlevel");
            return (Criteria) this;
        }

        public Criteria andReorderlevelGreaterThanOrEqualTo(String value) {
            addCriterion("reorderlevel >=", value, "reorderlevel");
            return (Criteria) this;
        }

        public Criteria andReorderlevelLessThan(String value) {
            addCriterion("reorderlevel <", value, "reorderlevel");
            return (Criteria) this;
        }

        public Criteria andReorderlevelLessThanOrEqualTo(String value) {
            addCriterion("reorderlevel <=", value, "reorderlevel");
            return (Criteria) this;
        }

        public Criteria andReorderlevelLike(String value) {
            addCriterion("reorderlevel like", value, "reorderlevel");
            return (Criteria) this;
        }

        public Criteria andReorderlevelNotLike(String value) {
            addCriterion("reorderlevel not like", value, "reorderlevel");
            return (Criteria) this;
        }

        public Criteria andReorderlevelIn(List<String> values) {
            addCriterion("reorderlevel in", values, "reorderlevel");
            return (Criteria) this;
        }

        public Criteria andReorderlevelNotIn(List<String> values) {
            addCriterion("reorderlevel not in", values, "reorderlevel");
            return (Criteria) this;
        }

        public Criteria andReorderlevelBetween(String value1, String value2) {
            addCriterion("reorderlevel between", value1, value2, "reorderlevel");
            return (Criteria) this;
        }

        public Criteria andReorderlevelNotBetween(String value1, String value2) {
            addCriterion("reorderlevel not between", value1, value2, "reorderlevel");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedIsNull() {
            addCriterion("discontinued is null");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedIsNotNull() {
            addCriterion("discontinued is not null");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedEqualTo(String value) {
            addCriterion("discontinued =", value, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedNotEqualTo(String value) {
            addCriterion("discontinued <>", value, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedGreaterThan(String value) {
            addCriterion("discontinued >", value, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedGreaterThanOrEqualTo(String value) {
            addCriterion("discontinued >=", value, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedLessThan(String value) {
            addCriterion("discontinued <", value, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedLessThanOrEqualTo(String value) {
            addCriterion("discontinued <=", value, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedLike(String value) {
            addCriterion("discontinued like", value, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedNotLike(String value) {
            addCriterion("discontinued not like", value, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedIn(List<String> values) {
            addCriterion("discontinued in", values, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedNotIn(List<String> values) {
            addCriterion("discontinued not in", values, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedBetween(String value1, String value2) {
            addCriterion("discontinued between", value1, value2, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedNotBetween(String value1, String value2) {
            addCriterion("discontinued not between", value1, value2, "discontinued");
            return (Criteria) this;
        }

        public Criteria andProductcodeIsNull() {
            addCriterion("productcode is null");
            return (Criteria) this;
        }

        public Criteria andProductcodeIsNotNull() {
            addCriterion("productcode is not null");
            return (Criteria) this;
        }

        public Criteria andProductcodeEqualTo(String value) {
            addCriterion("productcode =", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotEqualTo(String value) {
            addCriterion("productcode <>", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeGreaterThan(String value) {
            addCriterion("productcode >", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeGreaterThanOrEqualTo(String value) {
            addCriterion("productcode >=", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLessThan(String value) {
            addCriterion("productcode <", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLessThanOrEqualTo(String value) {
            addCriterion("productcode <=", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLike(String value) {
            addCriterion("productcode like", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotLike(String value) {
            addCriterion("productcode not like", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeIn(List<String> values) {
            addCriterion("productcode in", values, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotIn(List<String> values) {
            addCriterion("productcode not in", values, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeBetween(String value1, String value2) {
            addCriterion("productcode between", value1, value2, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotBetween(String value1, String value2) {
            addCriterion("productcode not between", value1, value2, "productcode");
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