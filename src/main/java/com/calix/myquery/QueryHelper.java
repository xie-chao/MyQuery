package com.calix.myquery;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

public abstract class QueryHelper<T> {

    private final Class<T> entityClass;

    @SuppressWarnings({"UnnecessaryParentheses", "unchecked"})
    public QueryHelper() {
        entityClass = (Class<T>)(((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
    }

//    public T getById(Object id) {
//        Field idField = MapperCache.getEntityId(entityClass);
//        return QueryBuilder.select()
//                .userMapper(entityClass)
//                .filter(Criteria.build().eq(idField.getName(), ""))
//                .getOne(entityClass);
//    }

    public List<T> getList(Object param) {
        return null;
    }

    public List<T> getList(Map<String, Object> param) {
        return null;
    }

    public List<T> update(T param) {
        return null;
    }

    public int delete(Object id) {
        return 0;
    }
}
