package com.v5ent.rapid4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class ShipperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShipperExample() {
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

        public Criteria andShipperidIsNull() {
            addCriterion("shipperid is null");
            return (Criteria) this;
        }

        public Criteria andShipperidIsNotNull() {
            addCriterion("shipperid is not null");
            return (Criteria) this;
        }

        public Criteria andShipperidEqualTo(String value) {
            addCriterion("shipperid =", value, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShipperidNotEqualTo(String value) {
            addCriterion("shipperid <>", value, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShipperidGreaterThan(String value) {
            addCriterion("shipperid >", value, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShipperidGreaterThanOrEqualTo(String value) {
            addCriterion("shipperid >=", value, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShipperidLessThan(String value) {
            addCriterion("shipperid <", value, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShipperidLessThanOrEqualTo(String value) {
            addCriterion("shipperid <=", value, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShipperidLike(String value) {
            addCriterion("shipperid like", value, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShipperidNotLike(String value) {
            addCriterion("shipperid not like", value, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShipperidIn(List<String> values) {
            addCriterion("shipperid in", values, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShipperidNotIn(List<String> values) {
            addCriterion("shipperid not in", values, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShipperidBetween(String value1, String value2) {
            addCriterion("shipperid between", value1, value2, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShipperidNotBetween(String value1, String value2) {
            addCriterion("shipperid not between", value1, value2, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShippernameIsNull() {
            addCriterion("shippername is null");
            return (Criteria) this;
        }

        public Criteria andShippernameIsNotNull() {
            addCriterion("shippername is not null");
            return (Criteria) this;
        }

        public Criteria andShippernameEqualTo(String value) {
            addCriterion("shippername =", value, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameNotEqualTo(String value) {
            addCriterion("shippername <>", value, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameGreaterThan(String value) {
            addCriterion("shippername >", value, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameGreaterThanOrEqualTo(String value) {
            addCriterion("shippername >=", value, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameLessThan(String value) {
            addCriterion("shippername <", value, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameLessThanOrEqualTo(String value) {
            addCriterion("shippername <=", value, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameLike(String value) {
            addCriterion("shippername like", value, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameNotLike(String value) {
            addCriterion("shippername not like", value, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameIn(List<String> values) {
            addCriterion("shippername in", values, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameNotIn(List<String> values) {
            addCriterion("shippername not in", values, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameBetween(String value1, String value2) {
            addCriterion("shippername between", value1, value2, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameNotBetween(String value1, String value2) {
            addCriterion("shippername not between", value1, value2, "shippername");
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