package com.calix.myquery;

import com.calix.myquery.annotation.Table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class QueryBuilder {

    private final StringBuilder sqlBuilder = new StringBuilder();

    public QueryBuilder execute(String sql) {
        return this;
    }

    public QueryBuilder select(Object value, Class<?> dest) {
        this.sqlBuilder.append("select ");
        return this;
    }

    public QueryBuilder add(Map<String, Object> value, Class<?> dest) {
        this.sqlBuilder.append("insert ");
        return this;
    }

    public QueryBuilder add(Object value, Class<?> dest) {
        this.sqlBuilder.append("insert ");
        return this;
    }

    public QueryBuilder update(Object value, Class<?> dest) {
        this.sqlBuilder.append("update ");
        return this;
    }

    public QueryBuilder update(Map<String, Object> value, Class<?> dest) {
        this.sqlBuilder.append("update ");
        return this;
    }

    public QueryBuilder delete(Object value, Class<?> dest) {
        this.sqlBuilder.append("delete userMapper ");
        return this;
    }

    public QueryBuilder delete(Map<String, Object> value, Class<?> dest) {
        this.sqlBuilder.append("delete userMapper ");
        return this;
    }

    public QueryBuilder userMapper(Class<?> voClass) {
        Table table = voClass.getAnnotation(Table.class);
        String tableName;
        if (table != null) {
            tableName = table.value();
        } else {
            tableName = voClass.getSimpleName();
        }
        sqlBuilder.append(tableName).append(" ");

        return this;
    }

    public QueryBuilder filter(Object params) {

        return this;
    }

    public QueryBuilder filter(Criteria criteria) {

        return this;
    }

    public QueryBuilder and(Object params) {
        return this;
    }

    public QueryBuilder and(Criteria criteria) {
        return this;
    }

    public QueryBuilder leftJoin(Class<?> table) {

        return this;
    }

    public QueryBuilder rightJoin(Class<?> table) {

        return this;
    }

    public QueryBuilder innerJoin(Class<?> table) {

        return this;
    }

    public QueryBuilder outerJoin(Class<?> table) {

        return this;
    }

    public QueryBuilder having(Class<?> table) {

        return this;
    }

    public QueryBuilder groupBy(String[] fields) {

        return this;
    }

    public QueryBuilder orderBy(String[] fields) {

        return this;
    }

    public QueryBuilder union(QueryBuilder builder) {

        return this;
    }

    public QueryBuilder unionAll(QueryBuilder builder) {

        return this;
    }

    public <R> List<R> getList(Class<R> resultType) {
        return new ArrayList<R>();
    }

    public <R> R getOne(Class<R> resultType) {
        return null;
    }

    public Map<String, Object> getMap() {
        return new HashMap<String, Object>();
    }

    public int execute() {
        return 0;
    }
}
