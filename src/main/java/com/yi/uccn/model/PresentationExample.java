package com.yi.uccn.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PresentationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PresentationExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTrademarkIsNull() {
            addCriterion("trademark is null");
            return (Criteria) this;
        }

        public Criteria andTrademarkIsNotNull() {
            addCriterion("trademark is not null");
            return (Criteria) this;
        }

        public Criteria andTrademarkEqualTo(String value) {
            addCriterion("trademark =", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkNotEqualTo(String value) {
            addCriterion("trademark <>", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkGreaterThan(String value) {
            addCriterion("trademark >", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkGreaterThanOrEqualTo(String value) {
            addCriterion("trademark >=", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkLessThan(String value) {
            addCriterion("trademark <", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkLessThanOrEqualTo(String value) {
            addCriterion("trademark <=", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkLike(String value) {
            addCriterion("trademark like", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkNotLike(String value) {
            addCriterion("trademark not like", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkIn(List<String> values) {
            addCriterion("trademark in", values, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkNotIn(List<String> values) {
            addCriterion("trademark not in", values, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkBetween(String value1, String value2) {
            addCriterion("trademark between", value1, value2, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkNotBetween(String value1, String value2) {
            addCriterion("trademark not between", value1, value2, "trademark");
            return (Criteria) this;
        }

        public Criteria andMarketingIsNull() {
            addCriterion("marketing is null");
            return (Criteria) this;
        }

        public Criteria andMarketingIsNotNull() {
            addCriterion("marketing is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingEqualTo(String value) {
            addCriterion("marketing =", value, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingNotEqualTo(String value) {
            addCriterion("marketing <>", value, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingGreaterThan(String value) {
            addCriterion("marketing >", value, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingGreaterThanOrEqualTo(String value) {
            addCriterion("marketing >=", value, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingLessThan(String value) {
            addCriterion("marketing <", value, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingLessThanOrEqualTo(String value) {
            addCriterion("marketing <=", value, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingLike(String value) {
            addCriterion("marketing like", value, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingNotLike(String value) {
            addCriterion("marketing not like", value, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingIn(List<String> values) {
            addCriterion("marketing in", values, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingNotIn(List<String> values) {
            addCriterion("marketing not in", values, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingBetween(String value1, String value2) {
            addCriterion("marketing between", value1, value2, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingNotBetween(String value1, String value2) {
            addCriterion("marketing not between", value1, value2, "marketing");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel1IsNull() {
            addCriterion("trademark_small_label_1 is null");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel1IsNotNull() {
            addCriterion("trademark_small_label_1 is not null");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel1EqualTo(String value) {
            addCriterion("trademark_small_label_1 =", value, "trademarkSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel1NotEqualTo(String value) {
            addCriterion("trademark_small_label_1 <>", value, "trademarkSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel1GreaterThan(String value) {
            addCriterion("trademark_small_label_1 >", value, "trademarkSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel1GreaterThanOrEqualTo(String value) {
            addCriterion("trademark_small_label_1 >=", value, "trademarkSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel1LessThan(String value) {
            addCriterion("trademark_small_label_1 <", value, "trademarkSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel1LessThanOrEqualTo(String value) {
            addCriterion("trademark_small_label_1 <=", value, "trademarkSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel1Like(String value) {
            addCriterion("trademark_small_label_1 like", value, "trademarkSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel1NotLike(String value) {
            addCriterion("trademark_small_label_1 not like", value, "trademarkSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel1In(List<String> values) {
            addCriterion("trademark_small_label_1 in", values, "trademarkSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel1NotIn(List<String> values) {
            addCriterion("trademark_small_label_1 not in", values, "trademarkSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel1Between(String value1, String value2) {
            addCriterion("trademark_small_label_1 between", value1, value2, "trademarkSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel1NotBetween(String value1, String value2) {
            addCriterion("trademark_small_label_1 not between", value1, value2, "trademarkSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel2IsNull() {
            addCriterion("trademark_small_label_2 is null");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel2IsNotNull() {
            addCriterion("trademark_small_label_2 is not null");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel2EqualTo(String value) {
            addCriterion("trademark_small_label_2 =", value, "trademarkSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel2NotEqualTo(String value) {
            addCriterion("trademark_small_label_2 <>", value, "trademarkSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel2GreaterThan(String value) {
            addCriterion("trademark_small_label_2 >", value, "trademarkSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel2GreaterThanOrEqualTo(String value) {
            addCriterion("trademark_small_label_2 >=", value, "trademarkSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel2LessThan(String value) {
            addCriterion("trademark_small_label_2 <", value, "trademarkSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel2LessThanOrEqualTo(String value) {
            addCriterion("trademark_small_label_2 <=", value, "trademarkSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel2Like(String value) {
            addCriterion("trademark_small_label_2 like", value, "trademarkSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel2NotLike(String value) {
            addCriterion("trademark_small_label_2 not like", value, "trademarkSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel2In(List<String> values) {
            addCriterion("trademark_small_label_2 in", values, "trademarkSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel2NotIn(List<String> values) {
            addCriterion("trademark_small_label_2 not in", values, "trademarkSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel2Between(String value1, String value2) {
            addCriterion("trademark_small_label_2 between", value1, value2, "trademarkSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel2NotBetween(String value1, String value2) {
            addCriterion("trademark_small_label_2 not between", value1, value2, "trademarkSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel3IsNull() {
            addCriterion("trademark_small_label_3 is null");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel3IsNotNull() {
            addCriterion("trademark_small_label_3 is not null");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel3EqualTo(String value) {
            addCriterion("trademark_small_label_3 =", value, "trademarkSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel3NotEqualTo(String value) {
            addCriterion("trademark_small_label_3 <>", value, "trademarkSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel3GreaterThan(String value) {
            addCriterion("trademark_small_label_3 >", value, "trademarkSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel3GreaterThanOrEqualTo(String value) {
            addCriterion("trademark_small_label_3 >=", value, "trademarkSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel3LessThan(String value) {
            addCriterion("trademark_small_label_3 <", value, "trademarkSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel3LessThanOrEqualTo(String value) {
            addCriterion("trademark_small_label_3 <=", value, "trademarkSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel3Like(String value) {
            addCriterion("trademark_small_label_3 like", value, "trademarkSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel3NotLike(String value) {
            addCriterion("trademark_small_label_3 not like", value, "trademarkSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel3In(List<String> values) {
            addCriterion("trademark_small_label_3 in", values, "trademarkSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel3NotIn(List<String> values) {
            addCriterion("trademark_small_label_3 not in", values, "trademarkSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel3Between(String value1, String value2) {
            addCriterion("trademark_small_label_3 between", value1, value2, "trademarkSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel3NotBetween(String value1, String value2) {
            addCriterion("trademark_small_label_3 not between", value1, value2, "trademarkSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel4IsNull() {
            addCriterion("trademark_small_label_4 is null");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel4IsNotNull() {
            addCriterion("trademark_small_label_4 is not null");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel4EqualTo(String value) {
            addCriterion("trademark_small_label_4 =", value, "trademarkSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel4NotEqualTo(String value) {
            addCriterion("trademark_small_label_4 <>", value, "trademarkSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel4GreaterThan(String value) {
            addCriterion("trademark_small_label_4 >", value, "trademarkSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel4GreaterThanOrEqualTo(String value) {
            addCriterion("trademark_small_label_4 >=", value, "trademarkSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel4LessThan(String value) {
            addCriterion("trademark_small_label_4 <", value, "trademarkSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel4LessThanOrEqualTo(String value) {
            addCriterion("trademark_small_label_4 <=", value, "trademarkSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel4Like(String value) {
            addCriterion("trademark_small_label_4 like", value, "trademarkSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel4NotLike(String value) {
            addCriterion("trademark_small_label_4 not like", value, "trademarkSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel4In(List<String> values) {
            addCriterion("trademark_small_label_4 in", values, "trademarkSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel4NotIn(List<String> values) {
            addCriterion("trademark_small_label_4 not in", values, "trademarkSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel4Between(String value1, String value2) {
            addCriterion("trademark_small_label_4 between", value1, value2, "trademarkSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andTrademarkSmallLabel4NotBetween(String value1, String value2) {
            addCriterion("trademark_small_label_4 not between", value1, value2, "trademarkSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel1IsNull() {
            addCriterion("marketing_small_label_1 is null");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel1IsNotNull() {
            addCriterion("marketing_small_label_1 is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel1EqualTo(String value) {
            addCriterion("marketing_small_label_1 =", value, "marketingSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel1NotEqualTo(String value) {
            addCriterion("marketing_small_label_1 <>", value, "marketingSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel1GreaterThan(String value) {
            addCriterion("marketing_small_label_1 >", value, "marketingSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel1GreaterThanOrEqualTo(String value) {
            addCriterion("marketing_small_label_1 >=", value, "marketingSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel1LessThan(String value) {
            addCriterion("marketing_small_label_1 <", value, "marketingSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel1LessThanOrEqualTo(String value) {
            addCriterion("marketing_small_label_1 <=", value, "marketingSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel1Like(String value) {
            addCriterion("marketing_small_label_1 like", value, "marketingSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel1NotLike(String value) {
            addCriterion("marketing_small_label_1 not like", value, "marketingSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel1In(List<String> values) {
            addCriterion("marketing_small_label_1 in", values, "marketingSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel1NotIn(List<String> values) {
            addCriterion("marketing_small_label_1 not in", values, "marketingSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel1Between(String value1, String value2) {
            addCriterion("marketing_small_label_1 between", value1, value2, "marketingSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel1NotBetween(String value1, String value2) {
            addCriterion("marketing_small_label_1 not between", value1, value2, "marketingSmallLabel1");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel2IsNull() {
            addCriterion("marketing_small_label_2 is null");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel2IsNotNull() {
            addCriterion("marketing_small_label_2 is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel2EqualTo(String value) {
            addCriterion("marketing_small_label_2 =", value, "marketingSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel2NotEqualTo(String value) {
            addCriterion("marketing_small_label_2 <>", value, "marketingSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel2GreaterThan(String value) {
            addCriterion("marketing_small_label_2 >", value, "marketingSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel2GreaterThanOrEqualTo(String value) {
            addCriterion("marketing_small_label_2 >=", value, "marketingSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel2LessThan(String value) {
            addCriterion("marketing_small_label_2 <", value, "marketingSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel2LessThanOrEqualTo(String value) {
            addCriterion("marketing_small_label_2 <=", value, "marketingSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel2Like(String value) {
            addCriterion("marketing_small_label_2 like", value, "marketingSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel2NotLike(String value) {
            addCriterion("marketing_small_label_2 not like", value, "marketingSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel2In(List<String> values) {
            addCriterion("marketing_small_label_2 in", values, "marketingSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel2NotIn(List<String> values) {
            addCriterion("marketing_small_label_2 not in", values, "marketingSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel2Between(String value1, String value2) {
            addCriterion("marketing_small_label_2 between", value1, value2, "marketingSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel2NotBetween(String value1, String value2) {
            addCriterion("marketing_small_label_2 not between", value1, value2, "marketingSmallLabel2");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel3IsNull() {
            addCriterion("marketing_small_label_3 is null");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel3IsNotNull() {
            addCriterion("marketing_small_label_3 is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel3EqualTo(String value) {
            addCriterion("marketing_small_label_3 =", value, "marketingSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel3NotEqualTo(String value) {
            addCriterion("marketing_small_label_3 <>", value, "marketingSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel3GreaterThan(String value) {
            addCriterion("marketing_small_label_3 >", value, "marketingSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel3GreaterThanOrEqualTo(String value) {
            addCriterion("marketing_small_label_3 >=", value, "marketingSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel3LessThan(String value) {
            addCriterion("marketing_small_label_3 <", value, "marketingSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel3LessThanOrEqualTo(String value) {
            addCriterion("marketing_small_label_3 <=", value, "marketingSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel3Like(String value) {
            addCriterion("marketing_small_label_3 like", value, "marketingSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel3NotLike(String value) {
            addCriterion("marketing_small_label_3 not like", value, "marketingSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel3In(List<String> values) {
            addCriterion("marketing_small_label_3 in", values, "marketingSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel3NotIn(List<String> values) {
            addCriterion("marketing_small_label_3 not in", values, "marketingSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel3Between(String value1, String value2) {
            addCriterion("marketing_small_label_3 between", value1, value2, "marketingSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel3NotBetween(String value1, String value2) {
            addCriterion("marketing_small_label_3 not between", value1, value2, "marketingSmallLabel3");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel4IsNull() {
            addCriterion("marketing_small_label_4 is null");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel4IsNotNull() {
            addCriterion("marketing_small_label_4 is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel4EqualTo(String value) {
            addCriterion("marketing_small_label_4 =", value, "marketingSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel4NotEqualTo(String value) {
            addCriterion("marketing_small_label_4 <>", value, "marketingSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel4GreaterThan(String value) {
            addCriterion("marketing_small_label_4 >", value, "marketingSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel4GreaterThanOrEqualTo(String value) {
            addCriterion("marketing_small_label_4 >=", value, "marketingSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel4LessThan(String value) {
            addCriterion("marketing_small_label_4 <", value, "marketingSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel4LessThanOrEqualTo(String value) {
            addCriterion("marketing_small_label_4 <=", value, "marketingSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel4Like(String value) {
            addCriterion("marketing_small_label_4 like", value, "marketingSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel4NotLike(String value) {
            addCriterion("marketing_small_label_4 not like", value, "marketingSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel4In(List<String> values) {
            addCriterion("marketing_small_label_4 in", values, "marketingSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel4NotIn(List<String> values) {
            addCriterion("marketing_small_label_4 not in", values, "marketingSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel4Between(String value1, String value2) {
            addCriterion("marketing_small_label_4 between", value1, value2, "marketingSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andMarketingSmallLabel4NotBetween(String value1, String value2) {
            addCriterion("marketing_small_label_4 not between", value1, value2, "marketingSmallLabel4");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCratedateIsNull() {
            addCriterion("crateDate is null");
            return (Criteria) this;
        }

        public Criteria andCratedateIsNotNull() {
            addCriterion("crateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCratedateEqualTo(Date value) {
            addCriterion("crateDate =", value, "cratedate");
            return (Criteria) this;
        }

        public Criteria andCratedateNotEqualTo(Date value) {
            addCriterion("crateDate <>", value, "cratedate");
            return (Criteria) this;
        }

        public Criteria andCratedateGreaterThan(Date value) {
            addCriterion("crateDate >", value, "cratedate");
            return (Criteria) this;
        }

        public Criteria andCratedateGreaterThanOrEqualTo(Date value) {
            addCriterion("crateDate >=", value, "cratedate");
            return (Criteria) this;
        }

        public Criteria andCratedateLessThan(Date value) {
            addCriterion("crateDate <", value, "cratedate");
            return (Criteria) this;
        }

        public Criteria andCratedateLessThanOrEqualTo(Date value) {
            addCriterion("crateDate <=", value, "cratedate");
            return (Criteria) this;
        }

        public Criteria andCratedateIn(List<Date> values) {
            addCriterion("crateDate in", values, "cratedate");
            return (Criteria) this;
        }

        public Criteria andCratedateNotIn(List<Date> values) {
            addCriterion("crateDate not in", values, "cratedate");
            return (Criteria) this;
        }

        public Criteria andCratedateBetween(Date value1, Date value2) {
            addCriterion("crateDate between", value1, value2, "cratedate");
            return (Criteria) this;
        }

        public Criteria andCratedateNotBetween(Date value1, Date value2) {
            addCriterion("crateDate not between", value1, value2, "cratedate");
            return (Criteria) this;
        }
    }

    /**
     */
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