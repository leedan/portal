package com.pab.framework.portal.repository.persistence.mybatis.entity.portal;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PortalGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageIndex;

    protected Integer pageCount;

    public PortalGroupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageCount() {
        return this.pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        @JsonIgnore
        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        void setCriteria(List<Criterion> criteria) {
            this.criteria = criteria;
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
            addCriterion("`Id` is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("`Id` is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("`Id` =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("`Id` <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("`Id` >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("`Id` >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("`Id` <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("`Id` <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("`Id` in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("`Id` not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("`Id` between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("`Id` not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIsNull() {
            addCriterion("`role_code` is null");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIsNotNull() {
            addCriterion("`role_code` is not null");
            return (Criteria) this;
        }

        public Criteria andRoleCodeEqualTo(String value) {
            addCriterion("`role_code` =", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotEqualTo(String value) {
            addCriterion("`role_code` <>", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeGreaterThan(String value) {
            addCriterion("`role_code` >", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("`role_code` >=", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLessThan(String value) {
            addCriterion("`role_code` <", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLessThanOrEqualTo(String value) {
            addCriterion("`role_code` <=", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLike(String value) {
            addCriterion("`role_code` like", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotLike(String value) {
            addCriterion("`role_code` not like", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIn(List<String> values) {
            addCriterion("`role_code` in", values, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotIn(List<String> values) {
            addCriterion("`role_code` not in", values, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeBetween(String value1, String value2) {
            addCriterion("`role_code` between", value1, value2, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotBetween(String value1, String value2) {
            addCriterion("`role_code` not between", value1, value2, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("`role_name` is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("`role_name` is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("`role_name` =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("`role_name` <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("`role_name` >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("`role_name` >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("`role_name` <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("`role_name` <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("`role_name` like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("`role_name` not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("`role_name` in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("`role_name` not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("`role_name` between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("`role_name` not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andArIsNull() {
            addCriterion("`ar` is null");
            return (Criteria) this;
        }

        public Criteria andArIsNotNull() {
            addCriterion("`ar` is not null");
            return (Criteria) this;
        }

        public Criteria andArEqualTo(Integer value) {
            addCriterion("`ar` =", value, "ar");
            return (Criteria) this;
        }

        public Criteria andArNotEqualTo(Integer value) {
            addCriterion("`ar` <>", value, "ar");
            return (Criteria) this;
        }

        public Criteria andArGreaterThan(Integer value) {
            addCriterion("`ar` >", value, "ar");
            return (Criteria) this;
        }

        public Criteria andArGreaterThanOrEqualTo(Integer value) {
            addCriterion("`ar` >=", value, "ar");
            return (Criteria) this;
        }

        public Criteria andArLessThan(Integer value) {
            addCriterion("`ar` <", value, "ar");
            return (Criteria) this;
        }

        public Criteria andArLessThanOrEqualTo(Integer value) {
            addCriterion("`ar` <=", value, "ar");
            return (Criteria) this;
        }

        public Criteria andArIn(List<Integer> values) {
            addCriterion("`ar` in", values, "ar");
            return (Criteria) this;
        }

        public Criteria andArNotIn(List<Integer> values) {
            addCriterion("`ar` not in", values, "ar");
            return (Criteria) this;
        }

        public Criteria andArBetween(Integer value1, Integer value2) {
            addCriterion("`ar` between", value1, value2, "ar");
            return (Criteria) this;
        }

        public Criteria andArNotBetween(Integer value1, Integer value2) {
            addCriterion("`ar` not between", value1, value2, "ar");
            return (Criteria) this;
        }

        public Criteria andDescribesIsNull() {
            addCriterion("`describes` is null");
            return (Criteria) this;
        }

        public Criteria andDescribesIsNotNull() {
            addCriterion("`describes` is not null");
            return (Criteria) this;
        }

        public Criteria andDescribesEqualTo(String value) {
            addCriterion("`describes` =", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotEqualTo(String value) {
            addCriterion("`describes` <>", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesGreaterThan(String value) {
            addCriterion("`describes` >", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesGreaterThanOrEqualTo(String value) {
            addCriterion("`describes` >=", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesLessThan(String value) {
            addCriterion("`describes` <", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesLessThanOrEqualTo(String value) {
            addCriterion("`describes` <=", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesLike(String value) {
            addCriterion("`describes` like", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotLike(String value) {
            addCriterion("`describes` not like", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesIn(List<String> values) {
            addCriterion("`describes` in", values, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotIn(List<String> values) {
            addCriterion("`describes` not in", values, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesBetween(String value1, String value2) {
            addCriterion("`describes` between", value1, value2, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotBetween(String value1, String value2) {
            addCriterion("`describes` not between", value1, value2, "describes");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("`creator_id` is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("`creator_id` is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(String value) {
            addCriterion("`creator_id` =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(String value) {
            addCriterion("`creator_id` <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(String value) {
            addCriterion("`creator_id` >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("`creator_id` >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(String value) {
            addCriterion("`creator_id` <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(String value) {
            addCriterion("`creator_id` <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLike(String value) {
            addCriterion("`creator_id` like", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotLike(String value) {
            addCriterion("`creator_id` not like", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<String> values) {
            addCriterion("`creator_id` in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<String> values) {
            addCriterion("`creator_id` not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(String value1, String value2) {
            addCriterion("`creator_id` between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(String value1, String value2) {
            addCriterion("`creator_id` not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNull() {
            addCriterion("`creator_name` is null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNotNull() {
            addCriterion("`creator_name` is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEqualTo(String value) {
            addCriterion("`creator_name` =", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotEqualTo(String value) {
            addCriterion("`creator_name` <>", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThan(String value) {
            addCriterion("`creator_name` >", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("`creator_name` >=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThan(String value) {
            addCriterion("`creator_name` <", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThanOrEqualTo(String value) {
            addCriterion("`creator_name` <=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLike(String value) {
            addCriterion("`creator_name` like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotLike(String value) {
            addCriterion("`creator_name` not like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIn(List<String> values) {
            addCriterion("`creator_name` in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotIn(List<String> values) {
            addCriterion("`creator_name` not in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameBetween(String value1, String value2) {
            addCriterion("`creator_name` between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotBetween(String value1, String value2) {
            addCriterion("`creator_name` not between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampIsNull() {
            addCriterion("`create_timestamp` is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampIsNotNull() {
            addCriterion("`create_timestamp` is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampEqualTo(Date value) {
            addCriterion("`create_timestamp` =", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampNotEqualTo(Date value) {
            addCriterion("`create_timestamp` <>", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampGreaterThan(Date value) {
            addCriterion("`create_timestamp` >", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("`create_timestamp` >=", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampLessThan(Date value) {
            addCriterion("`create_timestamp` <", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampLessThanOrEqualTo(Date value) {
            addCriterion("`create_timestamp` <=", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampIn(List<Date> values) {
            addCriterion("`create_timestamp` in", values, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampNotIn(List<Date> values) {
            addCriterion("`create_timestamp` not in", values, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampBetween(Date value1, Date value2) {
            addCriterion("`create_timestamp` between", value1, value2, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampNotBetween(Date value1, Date value2) {
            addCriterion("`create_timestamp` not between", value1, value2, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimestampIsNull() {
            addCriterion("`last_update_timestamp` is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimestampIsNotNull() {
            addCriterion("`last_update_timestamp` is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimestampEqualTo(Date value) {
            addCriterion("`last_update_timestamp` =", value, "lastUpdateTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimestampNotEqualTo(Date value) {
            addCriterion("`last_update_timestamp` <>", value, "lastUpdateTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimestampGreaterThan(Date value) {
            addCriterion("`last_update_timestamp` >", value, "lastUpdateTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("`last_update_timestamp` >=", value, "lastUpdateTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimestampLessThan(Date value) {
            addCriterion("`last_update_timestamp` <", value, "lastUpdateTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimestampLessThanOrEqualTo(Date value) {
            addCriterion("`last_update_timestamp` <=", value, "lastUpdateTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimestampIn(List<Date> values) {
            addCriterion("`last_update_timestamp` in", values, "lastUpdateTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimestampNotIn(List<Date> values) {
            addCriterion("`last_update_timestamp` not in", values, "lastUpdateTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimestampBetween(Date value1, Date value2) {
            addCriterion("`last_update_timestamp` between", value1, value2, "lastUpdateTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimestampNotBetween(Date value1, Date value2) {
            addCriterion("`last_update_timestamp` not between", value1, value2, "lastUpdateTimestamp");
            return (Criteria) this;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

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

        public Criterion() {
            super();
        }

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
    }
}