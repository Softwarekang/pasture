package cn.e3mall.pojo;

import java.util.ArrayList;
import java.util.List;

public class PigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PigExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andHeatIsNull() {
            addCriterion("heat is null");
            return (Criteria) this;
        }

        public Criteria andHeatIsNotNull() {
            addCriterion("heat is not null");
            return (Criteria) this;
        }

        public Criteria andHeatEqualTo(String value) {
            addCriterion("heat =", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatNotEqualTo(String value) {
            addCriterion("heat <>", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatGreaterThan(String value) {
            addCriterion("heat >", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatGreaterThanOrEqualTo(String value) {
            addCriterion("heat >=", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatLessThan(String value) {
            addCriterion("heat <", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatLessThanOrEqualTo(String value) {
            addCriterion("heat <=", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatLike(String value) {
            addCriterion("heat like", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatNotLike(String value) {
            addCriterion("heat not like", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatIn(List<String> values) {
            addCriterion("heat in", values, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatNotIn(List<String> values) {
            addCriterion("heat not in", values, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatBetween(String value1, String value2) {
            addCriterion("heat between", value1, value2, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatNotBetween(String value1, String value2) {
            addCriterion("heat not between", value1, value2, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatrateIsNull() {
            addCriterion("heatrate is null");
            return (Criteria) this;
        }

        public Criteria andHeatrateIsNotNull() {
            addCriterion("heatrate is not null");
            return (Criteria) this;
        }

        public Criteria andHeatrateEqualTo(String value) {
            addCriterion("heatrate =", value, "heatrate");
            return (Criteria) this;
        }

        public Criteria andHeatrateNotEqualTo(String value) {
            addCriterion("heatrate <>", value, "heatrate");
            return (Criteria) this;
        }

        public Criteria andHeatrateGreaterThan(String value) {
            addCriterion("heatrate >", value, "heatrate");
            return (Criteria) this;
        }

        public Criteria andHeatrateGreaterThanOrEqualTo(String value) {
            addCriterion("heatrate >=", value, "heatrate");
            return (Criteria) this;
        }

        public Criteria andHeatrateLessThan(String value) {
            addCriterion("heatrate <", value, "heatrate");
            return (Criteria) this;
        }

        public Criteria andHeatrateLessThanOrEqualTo(String value) {
            addCriterion("heatrate <=", value, "heatrate");
            return (Criteria) this;
        }

        public Criteria andHeatrateLike(String value) {
            addCriterion("heatrate like", value, "heatrate");
            return (Criteria) this;
        }

        public Criteria andHeatrateNotLike(String value) {
            addCriterion("heatrate not like", value, "heatrate");
            return (Criteria) this;
        }

        public Criteria andHeatrateIn(List<String> values) {
            addCriterion("heatrate in", values, "heatrate");
            return (Criteria) this;
        }

        public Criteria andHeatrateNotIn(List<String> values) {
            addCriterion("heatrate not in", values, "heatrate");
            return (Criteria) this;
        }

        public Criteria andHeatrateBetween(String value1, String value2) {
            addCriterion("heatrate between", value1, value2, "heatrate");
            return (Criteria) this;
        }

        public Criteria andHeatrateNotBetween(String value1, String value2) {
            addCriterion("heatrate not between", value1, value2, "heatrate");
            return (Criteria) this;
        }

        public Criteria andLocationXIsNull() {
            addCriterion("location-x is null");
            return (Criteria) this;
        }

        public Criteria andLocationXIsNotNull() {
            addCriterion("location-x is not null");
            return (Criteria) this;
        }

        public Criteria andLocationXEqualTo(Integer value) {
            addCriterion("location-x =", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXNotEqualTo(Integer value) {
            addCriterion("location-x <>", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXGreaterThan(Integer value) {
            addCriterion("location-x >", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXGreaterThanOrEqualTo(Integer value) {
            addCriterion("location-x >=", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXLessThan(Integer value) {
            addCriterion("location-x <", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXLessThanOrEqualTo(Integer value) {
            addCriterion("location-x <=", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXIn(List<Integer> values) {
            addCriterion("location-x in", values, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXNotIn(List<Integer> values) {
            addCriterion("location-x not in", values, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXBetween(Integer value1, Integer value2) {
            addCriterion("location-x between", value1, value2, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXNotBetween(Integer value1, Integer value2) {
            addCriterion("location-x not between", value1, value2, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationYIsNull() {
            addCriterion("location-y is null");
            return (Criteria) this;
        }

        public Criteria andLocationYIsNotNull() {
            addCriterion("location-y is not null");
            return (Criteria) this;
        }

        public Criteria andLocationYEqualTo(Integer value) {
            addCriterion("location-y =", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYNotEqualTo(Integer value) {
            addCriterion("location-y <>", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYGreaterThan(Integer value) {
            addCriterion("location-y >", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYGreaterThanOrEqualTo(Integer value) {
            addCriterion("location-y >=", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYLessThan(Integer value) {
            addCriterion("location-y <", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYLessThanOrEqualTo(Integer value) {
            addCriterion("location-y <=", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYIn(List<Integer> values) {
            addCriterion("location-y in", values, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYNotIn(List<Integer> values) {
            addCriterion("location-y not in", values, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYBetween(Integer value1, Integer value2) {
            addCriterion("location-y between", value1, value2, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYNotBetween(Integer value1, Integer value2) {
            addCriterion("location-y not between", value1, value2, "locationY");
            return (Criteria) this;
        }

        public Criteria andAexerciseIsNull() {
            addCriterion("aexercise is null");
            return (Criteria) this;
        }

        public Criteria andAexerciseIsNotNull() {
            addCriterion("aexercise is not null");
            return (Criteria) this;
        }

        public Criteria andAexerciseEqualTo(Integer value) {
            addCriterion("aexercise =", value, "aexercise");
            return (Criteria) this;
        }

        public Criteria andAexerciseNotEqualTo(Integer value) {
            addCriterion("aexercise <>", value, "aexercise");
            return (Criteria) this;
        }

        public Criteria andAexerciseGreaterThan(Integer value) {
            addCriterion("aexercise >", value, "aexercise");
            return (Criteria) this;
        }

        public Criteria andAexerciseGreaterThanOrEqualTo(Integer value) {
            addCriterion("aexercise >=", value, "aexercise");
            return (Criteria) this;
        }

        public Criteria andAexerciseLessThan(Integer value) {
            addCriterion("aexercise <", value, "aexercise");
            return (Criteria) this;
        }

        public Criteria andAexerciseLessThanOrEqualTo(Integer value) {
            addCriterion("aexercise <=", value, "aexercise");
            return (Criteria) this;
        }

        public Criteria andAexerciseIn(List<Integer> values) {
            addCriterion("aexercise in", values, "aexercise");
            return (Criteria) this;
        }

        public Criteria andAexerciseNotIn(List<Integer> values) {
            addCriterion("aexercise not in", values, "aexercise");
            return (Criteria) this;
        }

        public Criteria andAexerciseBetween(Integer value1, Integer value2) {
            addCriterion("aexercise between", value1, value2, "aexercise");
            return (Criteria) this;
        }

        public Criteria andAexerciseNotBetween(Integer value1, Integer value2) {
            addCriterion("aexercise not between", value1, value2, "aexercise");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
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