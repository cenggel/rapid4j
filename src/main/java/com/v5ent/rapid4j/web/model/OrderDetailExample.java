package com.v5ent.rapid4j.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailExample() {
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

        public Criteria andOrderdetailidIsNull() {
            addCriterion("orderdetailid is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidIsNotNull() {
            addCriterion("orderdetailid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidEqualTo(String value) {
            addCriterion("orderdetailid =", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotEqualTo(String value) {
            addCriterion("orderdetailid <>", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidGreaterThan(String value) {
            addCriterion("orderdetailid >", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidGreaterThanOrEqualTo(String value) {
            addCriterion("orderdetailid >=", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidLessThan(String value) {
            addCriterion("orderdetailid <", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidLessThanOrEqualTo(String value) {
            addCriterion("orderdetailid <=", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidLike(String value) {
            addCriterion("orderdetailid like", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotLike(String value) {
            addCriterion("orderdetailid not like", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidIn(List<String> values) {
            addCriterion("orderdetailid in", values, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotIn(List<String> values) {
            addCriterion("orderdetailid not in", values, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidBetween(String value1, String value2) {
            addCriterion("orderdetailid between", value1, value2, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotBetween(String value1, String value2) {
            addCriterion("orderdetailid not between", value1, value2, "orderdetailid");
            return (Criteria) this;
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

        public Criteria andLineitemnumberIsNull() {
            addCriterion("lineitemnumber is null");
            return (Criteria) this;
        }

        public Criteria andLineitemnumberIsNotNull() {
            addCriterion("lineitemnumber is not null");
            return (Criteria) this;
        }

        public Criteria andLineitemnumberEqualTo(Integer value) {
            addCriterion("lineitemnumber =", value, "lineitemnumber");
            return (Criteria) this;
        }

        public Criteria andLineitemnumberNotEqualTo(Integer value) {
            addCriterion("lineitemnumber <>", value, "lineitemnumber");
            return (Criteria) this;
        }

        public Criteria andLineitemnumberGreaterThan(Integer value) {
            addCriterion("lineitemnumber >", value, "lineitemnumber");
            return (Criteria) this;
        }

        public Criteria andLineitemnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("lineitemnumber >=", value, "lineitemnumber");
            return (Criteria) this;
        }

        public Criteria andLineitemnumberLessThan(Integer value) {
            addCriterion("lineitemnumber <", value, "lineitemnumber");
            return (Criteria) this;
        }

        public Criteria andLineitemnumberLessThanOrEqualTo(Integer value) {
            addCriterion("lineitemnumber <=", value, "lineitemnumber");
            return (Criteria) this;
        }

        public Criteria andLineitemnumberIn(List<Integer> values) {
            addCriterion("lineitemnumber in", values, "lineitemnumber");
            return (Criteria) this;
        }

        public Criteria andLineitemnumberNotIn(List<Integer> values) {
            addCriterion("lineitemnumber not in", values, "lineitemnumber");
            return (Criteria) this;
        }

        public Criteria andLineitemnumberBetween(Integer value1, Integer value2) {
            addCriterion("lineitemnumber between", value1, value2, "lineitemnumber");
            return (Criteria) this;
        }

        public Criteria andLineitemnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("lineitemnumber not between", value1, value2, "lineitemnumber");
            return (Criteria) this;
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

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
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