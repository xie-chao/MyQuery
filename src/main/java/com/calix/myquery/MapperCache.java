package com.calix.myquery;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class MapperCache {

    private static final Map<Class, EntityProperties> MAPPER_CACHE = new HashMap<Class, EntityProperties>();

    public static Field getEntityId(Class clazz) {
        Assert.notNull(clazz, "");
        EntityProperties prop = MAPPER_CACHE.get(clazz);
        Assert.notNull(prop, "");
        return prop.getId();
    }

    private class EntityProperties {
        private Field id;

        public Field getId() {
            return id;
        }

        public void setId(Field id) {
            this.id = id;
        }
    }

    public static void initMapper() {

    }
}
