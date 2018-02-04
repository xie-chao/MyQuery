package com.calix.myquery;

import java.util.Collection;

public class Criteria {

    private Criteria() {}

    private static final Criteria criteria = new Criteria();

    public static Criteria build() {
        return criteria;
    }

    public Criteria eq(String field, Object value) {
        return criteria;
    }

    public Criteria gt(String field, Object value) {
        return criteria;
    }

    public Criteria ge(String field, Object value) {
        return criteria;
    }

    public Criteria lt(String field, Object value) {
        return criteria;
    }

    public Criteria le(String field, Object value) {
        return criteria;
    }

    public Criteria bt(String field, Object begin, Object end) {
        return criteria;
    }

    public Criteria in(String field, Collection range) {
        return criteria;
    }

    public Criteria in(String field, Object[] range) {
        return criteria;
    }

    public Criteria or(String field, Criteria criteria) {
        return criteria;
    }

    public Criteria isNull(String field) {
        return criteria;
    }

    public Criteria isNotNull(String field) {
        return criteria;
    }

    public Criteria pLeft() {
        return criteria;
    }

    public Criteria pRight() {
        return criteria;
    }
}
